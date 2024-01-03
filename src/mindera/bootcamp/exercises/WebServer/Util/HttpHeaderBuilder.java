package mindera.bootcamp.exercises.WebServer.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HttpHeaderBuilder {

    public static String notAllowed() {
        return """
                HTTP/1.0 405 Method Not Allowed\r
                Allow: GET\r
                """;
    }

    public static String notFound(String fileName, long length) {
        return "HTTP/1.0 404 Not Found \r" +
                contentType(fileName) +
                "Content-Length: " + length + "\r\n\r\n";
    }

    public static String ok(String filename, long length) {
        return "HTTP/1.0 200 Document Follows\r\n" +
                contentType(filename) +
                "Content-Length: " + length + "\r\n\r\n";
    }

    private static String contentType(String filename) {

        String contentType = "";
        try {
            contentType = Files.probeContentType(Path.of("www" + filename));
        } catch (IOException e) {

        }
        return "Content-Type: " + contentType + "; charset=UTF-8\r\n";
    }

}
