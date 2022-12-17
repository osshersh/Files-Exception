package task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

    public static void main(String[] args) {
        File file = new File("C:\\Files-Exception\\src\\main\\resources\\data.txt");
        String filePath = file.getPath();
        readFile(filePath);
    }

    public static void readFile(String filePath) {
        try {
            String fileContent = Files.readString(Paths.get(filePath));
            System.out.println(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

