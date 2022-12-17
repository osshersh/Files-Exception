package task0;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Files-Exception\\src\\main\\resources\\data.txt");
        String filePath = file.getPath();

        FileWrite fileWrite = new FileWrite();
        String fileContent = "Kurs\n" +
                "Java\n" +
                "Lekcja 6\n" +
                "Pliki\n" +
                "Wyjątki\n" +
                "Pliki\n" +
                "Koniec pliku";

        fileWrite.writeToFile(filePath,fileContent,file);


    }
}
