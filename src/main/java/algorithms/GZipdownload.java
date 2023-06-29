package algorithms;

import org.apache.commons.io.IOUtils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

public class GZipdownload {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://ocap.red-bear.ru/data/2020_10_31__23_45_RBC187Ionstormv1.json");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Accept-Encoding", "gzip");
        GZIPInputStream gzipInputStream = new GZIPInputStream(con.getInputStream());
        byte[] file = IOUtils.toByteArray(gzipInputStream);
        System.out.println(file.length);
        String s = new String(file, StandardCharsets.UTF_8);
        System.out.println();
    }
}
