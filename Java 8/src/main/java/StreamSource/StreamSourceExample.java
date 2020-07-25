package StreamSource;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamSourceExample {


    public static void main(String[] args) {

        System.out.println("Examples of Stream Source");

        String a = "Apple";
        String b = "Orange";
        String c ="grape";

        Optional<String> smallest = getSmallest(a, b, c);

        smallest.ifPresent(System.out::print);
    }

    private static Optional<String> getSmallest(String a,String b,String c){
       return Stream.of(a,b,c)
                .min(Comparator.naturalOrder());
    }
}
