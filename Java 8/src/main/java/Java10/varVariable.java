package Java10;

import javax.swing.*;
import java.util.function.Consumer;

public class varVariable {

    public static void main(String[] args) {

        System.out.println("Var variable Demo ");
        checkVar();

    }

    private static void checkVar(){

        var string = "Hello";
        System.out.println(string);

        Consumer<Integer> lambda = (i) -> {
            i = i + i;
            var hello = "good morning";
            System.out.println(hello + i) ;
        };
        lambda.accept(17);
    }
}
