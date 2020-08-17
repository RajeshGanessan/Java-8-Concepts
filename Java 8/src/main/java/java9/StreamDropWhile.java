package java9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDropWhile {

    public static void main(String[] args) {
        System.out.println("Stream DropWhile");

        Stream<Integer> nums = Stream.of(4,2,1,4,5,3,7,10,15,17,33);

        System.out.println(
                nums.dropWhile(i ->i < 5)
                .collect(Collectors.toList())
        );
    }
}
