package task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static void calculateSignInFile(String filePath) {
        try {
            String fileContent = Files.readString(Paths.get(filePath));
            System.out.println(fileContent.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
