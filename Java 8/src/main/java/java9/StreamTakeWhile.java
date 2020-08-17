package java9;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTakeWhile {

    public static void main(String[] args) {
        System.out.println("Stream TakeWhile");
        Stream<Integer> numbers = Stream.of(1,3,3,4,5,2,7,9,34,12,434,5,5);

        System.out.println(
                numbers.takeWhile(i -> i < 7)
                .collect(Collectors.toList())
        );
    }
}
