package task6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {
    public static void main(String[] args) {
        File data = new File("C:\\Files-Exception\\src\\main\\resources\\data.txt");
        File output = new File("C:\\Files-Exception\\src\\main\\resources\\output.txt");

        readFile(data.getPath(),output.getPath());
    }

    public static void readFile(String filePathRead, String filePathWrite) {
        String fileContentsToUpper = "";
        try {
            fileContentsToUpper = Files.readString(Paths.get(filePathRead)).toUpperCase();
            writeFile(filePathWrite, fileContentsToUpper);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile(String filePath, String fileContents) {

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(filePath))) {
             bufferedWriter.write(fileContents);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
