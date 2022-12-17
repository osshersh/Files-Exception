package task0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWrite {
    private void createFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void writeToFile(String filePath, String text, File file) {
        createFile(file);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {
            writer.write(text);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

