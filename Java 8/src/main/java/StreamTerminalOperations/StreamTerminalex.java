package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTerminalex {

    public static void main(String[] args) {


        List<String> Fruits = Arrays.asList("Apple","Orange","Grapes","egg");

        System.out.println(Fruits.stream()
                .filter(s -> s.contains("s"))
                .count());


        //Optional and FindFirst()
        Optional<String> op  = Fruits.stream()
                .filter(s -> s.contains("p"))
                .findFirst();

        if(op.isPresent()){
            System.out.println(op.get());
        }
        System.out.println(Fruits.stream()
        .filter(s -> s.length() > 3)
                .findFirst());
    }
}
