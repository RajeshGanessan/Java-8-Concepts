package PredicateAndFunction;

import java.util.function.Function;

public class FunctionInterface  {

    public static void main(String[] args) {


        Function<Integer,Double> div  = a -> a/12.4;
        //COmpose
        div = div.compose(a -> a * 14);
        //andThen
        div = div.andThen(a -> a * 5);
        System.out.println(div.apply(20));

        Function<Integer,Double> result = functionRule();

       result =  result.andThen(a-> a+10);

        System.out.println("Result of Function" + result.apply(10));
    }

    public static Function<Integer,Double> functionRule(){

        Function<Integer,Double> square  = (num) -> num * 5.5;

        return square;
    }
}
