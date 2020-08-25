package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathChanges {

    public static void main(String[] args) throws IOException {

        System.out.println("File path changes");

        Path path =  Paths.get(System.getProperty("user.dir") + "/sample.txt");

        Files.writeString(path,"Happy birthdayyyy!!!");

        Files.readAllLines(path);
    }
}
