package Assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
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
        System.out.println(collect.size());

        long chars = list.stream()
                .filter(s -> s.startsWith("M"))
                .map(String::trim)
                .map(name -> name.length())
                .mapToInt(i -> i )
                .sum();
        System.out.println("Total chars in words starting with M : " +chars);

        List<String> collect1 = list.stream()
                .filter(name -> name.contains("-"))
                .map(name -> name.replace('-', ' '))
                .collect(Collectors.toList());

        collect1.forEach(System.out::println);

        System.out.println(
                list.stream()
                        .max(Comparator.comparing(s -> s.length()))
                .get()
        );

    }
}
