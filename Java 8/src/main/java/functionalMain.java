import Lamba.GreetingService;

import java.sql.SQLOutput;
import java.util.Random;

public class functionalMain {


    public static void main(String[] args) {

//
//        GreetingService greet = (n) -> n.toUpperCase();
//        test(greet);
//        test(n -> n.toUpperCase() + n.toLowerCase());
//        test(n -> n.replace('y','z'));

        /* Next Example */

        test( n -> {
            System.out.println("Inside the Lambda function");
           return n.toUpperCase();
        });

        /* passing data to behaviour */
       String lambdaString =  getLambda().greet("rajeshganessan");
        System.out.println(lambdaString);
    }

    private static void test(GreetingService g){
        System.out.println("Inside the Greeting service Method");
        String returnedString = g.greet("udemy");
        System.out.println(returnedString);
    }

    private static GreetingService getLambda(){
        GreetingService g = (n -> {
            System.out.println("In the GetLambda method");
            return n.toUpperCase() + n.toLowerCase();
        });
        return g;
    }

//    //getting a number
//    private static int getNumber(){
//        System.out.println("Getting Number");
//        Random rand = new Random();
//        return rand.nextInt();
//    }
//
//    //Receive number
//    private static void receiveNumber(int i){
//        System.out.println("received the number "+ i );
//    }
}
