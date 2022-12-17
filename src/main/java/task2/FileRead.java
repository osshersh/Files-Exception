package task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRead {
    private static String readFile(String filePath) {
          String fileContent = "";
        try {
            fileContent = Files.readString(Paths.get(filePath));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileContent;
    }

    public static void printEverySecondLine(String filePath) {
        String[] fileContent = readFile(filePath).split("\n");

        for (int i = 0; i <= fileContent.length - 1; i++) {
            if (i % 2 != 0) {
                System.out.println(fileContent[i]);
            }
        }
    }
}