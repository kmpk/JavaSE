package hyperskill;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String encoded = new String(Base64.getEncoder().encode(name.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        System.out.println(encoded);
    }
}