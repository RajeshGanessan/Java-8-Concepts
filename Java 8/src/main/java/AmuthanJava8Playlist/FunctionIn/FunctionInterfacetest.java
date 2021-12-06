package AmuthanJava8Playlist.FunctionIn;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionInterfacetest {

    private static Function<Integer,Integer> addition = i -> i+5;
    private static Function<Integer,Integer> multiply = i -> i*5;
    private static UnaryOperator<String> unary = String::toLowerCase;
   private static BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b*5;

    public static void main(String[] args) {

        System.out.println(addition.andThen(multiply).apply(15));

        System.out.println(addition.compose(multiply).apply(10));
        System.out.println(unary.andThen(s->s.toUpperCase()).apply("test"));

        System.out.println(biFunction.apply(1,5));
    }
}
