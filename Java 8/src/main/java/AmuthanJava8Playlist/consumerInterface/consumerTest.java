package AmuthanJava8Playlist.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerTest {

    public static void main(String[] args) {

        System.out.println("Using consumer interface");

        List<String> items = Arrays.asList("apple","Orange","Mango");

        Consumer<String> toUpperCase = String::toUpperCase;
        Consumer<String> printToConsole = s -> s.toUpperCase();

        items.forEach(printToConsole.andThen(toUpperCase));


    }
}
