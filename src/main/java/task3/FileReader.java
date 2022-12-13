package task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static void calculateSignInFile(String filePath) {
        try {
            String sign = "";
            String[] fileContent = Files.readString(Paths.get(filePath)).split("\n");
            for (int i = 0; i <= fileContent.length - 1; i++) {
                sign = sign + fileContent[i];
            }
            System.out.println(sign.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
