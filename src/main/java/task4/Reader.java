package task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    public static int getNumberRepeatOfWord(String filePath, String searchWord) {
        return countWord(searchWord, getWordsFromFile(filePath));
    }

    private static String[] getWordsFromFile(String filePath) {
        try {
            String fileContentWithoutNewLine = Files.readString(Paths.get(filePath)).replaceAll("\\n", " ");
            return fileContentWithoutNewLine.split(" ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int countWord(String searchWord, String[] array) {
        int count = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equals(searchWord)) {
                count++;
            }
        }
        return count;
    }
}
