package task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    public static int getNumberRepeatOfWord(String filePath, String searchWord) {
        return countWord(searchWord, getWordsFromFile(filePath));
    }

    private static String[] getWordsFromFile(String filePath) {
        String fileContentWithoutNewLine = filePath;
        String[] fileContent = new String[fileContentWithoutNewLine.length()];

        try {
            fileContentWithoutNewLine = Files.readString(Paths.get(filePath)).replaceAll("\\n", " ");
            return fileContent = fileContentWithoutNewLine.split(" ");
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
