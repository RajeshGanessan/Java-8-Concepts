package PredicateAndFunction;

import java.util.function.Predicate;

public class predicate<W> {

    public static void main(String[] args) {


        Predicate<Integer> isGreater  = (n) -> n > 10;
        Predicate<Integer> isLessThan = (n) -> n < 50;

        System.out.println(
                isGreater.and(isLessThan).test(22)
        );
    }
}
