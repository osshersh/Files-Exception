package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    public static void reverseFileContent(String filePath) {
        if (filePath == null) {
            throw new NullPointerException("This path doesn't exist");
        }
        try {
            StringBuilder substring = new StringBuilder(Files.readString(Paths.get(filePath)).trim());
            substring.reverse();
            System.out.println(substring);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
