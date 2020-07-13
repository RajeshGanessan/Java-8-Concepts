package MainClasses;

import Lamba.MathOperation;

public class Calculator {


    public static void main(String[] args) {

        System.out.println("Calulator using lambda functions");

//          MathOperation expression = (a,b) ->((((a + b) - 3) * 7) + 2)/3;
//
//        MathOperation add = (a,b) -> a+b;
//        MathOperation sub = (a,b) -> a-b;
//        MathOperation mul = (a,b) -> a*b;
//        MathOperation div = (a,b) -> a/b;
//
//        int onScreenNumber = 0;
//
//        onScreenNumber = calculate(5,add,2);
//        onScreenNumber = calculate(onScreenNumber,sub,3);
//        onScreenNumber = calculate(onScreenNumber,mul,7);
//        onScreenNumber = calculate(onScreenNumber,add,2);
//        onScreenNumber = calculate(onScreenNumber,div,3);


//        System.out.println(onScreenNumber);

        String expression = "10 / 2 * 3 - 3 / 3 * 5 ^ 3";

        Assignments.Calculator.addOperation("^", (a,b) ->(int) Math.pow(a,b));

        System.out.println(

                Assignments.Calculator.calculate(expression)
        );


//        int result = calculate(5,expression,2);
//                System.out.println("Result is " + result);
    }
}
