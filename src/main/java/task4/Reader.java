package task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    public static void searchWord(String filePath, String searchWord) {
        try {
            int count = 0;
            String fileContentWithoutNewLine = Files.readString(Paths.get(filePath)).replaceAll("\\n", " ");
            String[] fileContent = fileContentWithoutNewLine.split(" ");

            for (int i = 0; i <= fileContent.length - 1; i++) {
                if (fileContent[i].equals(searchWord)) {
                    count++;
                }
            }
            System.out.println(searchWord + " was found " + count + " times");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
