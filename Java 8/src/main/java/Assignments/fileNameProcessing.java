package Assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class fileNameProcessing {

    public static void main(String[] args) throws IOException {
        System.out.println("Reading data fromt text file");

        Path path = Paths.get("/Users/letsventure/Desktop/text.txt");

        List<String> list = Files.readAllLines(path);
        long count = list.stream()
                .filter(s -> s.startsWith("B"))
                .count();

        System.out.println("Count of words starts with B  :"+count);
        System.out.println("<===============>");
        List<String> collect = list.stream()
                .filter(s -> s.startsWith("C") && s.contains("s"))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        long chars = list.stream()
                .filter(s -> s.startsWith("M"))
                .map(String::toCharArray)
                .count();
        System.out.println("Total chars in words starting with M : " +chars);
    }
}
