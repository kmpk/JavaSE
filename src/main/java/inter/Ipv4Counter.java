package inter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.BitSet;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class Ipv4Counter {
    private final Path file;

    public Ipv4Counter(Path file) {
        this.file = file;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pass file path as command-line argument, example: \"/path/to/file\"");
            System.exit(0);
        }

        Ipv4Counter ipv4Counter = new Ipv4Counter(Path.of(args[0]));

        System.out.println("Started: " + LocalDateTime.now());
        try {
            System.out.printf("Unique ip addresses counted: %d%n", ipv4Counter.count());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ended: " + LocalDateTime.now());
    }

    private int count() throws IOException {
        return processByStream(file);
    }

    private int processByStream(Path file) throws IOException {
        try (Stream<String> lines = Files
                .lines(file, StandardCharsets.US_ASCII)) {
            BitSet positive = new BitSet();
            BitSet negative = new BitSet();
            lines
                    .parallel()
                    .mapToInt(this::parseIpv4)
                    .forEach(addIpToBitSet(positive, negative));
            return positive.cardinality() + negative.cardinality();
        }
    }

    private IntConsumer addIpToBitSet(BitSet positive, BitSet negative) {
        return i -> {
            if (i < 0) {
                synchronized (negative) {

                }
            } else {
                synchronized (positive) {
                    positive.set(i);
                }
            }
        };
    }

    private int parseIpv4(CharSequence ipv4) {
        StringBuilder builder = new StringBuilder();
        int result = 0;
        int counter = 0;
        for (int i = 0; i < ipv4.length(); i++) {
            char c = ipv4.charAt(i);
            if (c != '.') {
                builder.append(c);
            } else {
                result += Integer.parseInt(builder.toString()) << ((3 - counter) * 8);
                counter++;
                builder.setLength(0);
            }
        }
        result += Integer.parseInt(builder.toString()) << ((3 - counter) * 8);
        builder.setLength(0);
        return result;
    }
}

/*

        <native.maven.plugin.version>0.9.6</native.maven.plugin.version>
<profiles>
        <profile>
            <id>native</id>
            <build>
                <plugins>
                    <plugin>
                        <groupId>org.graalvm.buildtools</groupId>
                        <artifactId>native-maven-plugin</artifactId>
                        <version>${native.maven.plugin.version}</version>
                        <extensions>true</extensions>
                        <executions>
                            <execution>
                                <id>build-native</id>
                                <goals>
                                    <goal>build</goal>
                                </goals>
                                <phase>package</phase>
                            </execution>
                            <execution>
                                <id>test-native</id>
                                <goals>
                                    <goal>test</goal>
                                </goals>
                                <phase>test</phase>
                            </execution>
                        </executions>
                        <configuration>
                            <mainClass>pkg.Console</mainClass>
                            <buildArgs>
                                <buildArg>--no-fallback</buildArg>
                            </buildArgs>
                        </configuration>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>
 */
