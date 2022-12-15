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

        String fileContent = convertFileContentToUpperCase(data.getPath());
        writeFile(output.getPath(), fileContent);
    }

    public static String readFile(String filePath) {
        if (filePath == null) {
            throw new NullPointerException("Path can't null");
        }
        try {
            return Files.readString(Paths.get(filePath));
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

    public static String convertFileContentToUpperCase(String filePath) {
        return readFile(filePath).toUpperCase();
    }
}
