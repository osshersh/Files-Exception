package task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    public static void searchWord(String filePath, String searchWord) {
        try {
            int count = 0;
            String fileContentWithoutNewLine = "";
            String[] x = Files.readString(Paths.get(filePath)).split("\n");
            for (String word : x) {
                fileContentWithoutNewLine += word + " ";
            }

            String[] fileContent1 = fileContentWithoutNewLine.split(" ");
            for (int i = 0; i <= fileContent1.length - 1; i++) {
                if (fileContent1[i].equals(searchWord)) {
                    count++;
                }
            }
            System.out.println(searchWord + " was found " + count + " times");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
