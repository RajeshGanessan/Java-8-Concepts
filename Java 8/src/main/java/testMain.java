import Basics.Iphone;
import Lamba.GreetingService;

import java.util.ArrayList;
import java.util.List;

public class testMain {

    public static void main(String[] args) {


        int a = 5;
        Iphone iphone = new Iphone();
        List list = new ArrayList();
//
//        GreetingService g = (name, age, weight) -> {
//
//        };

        //g.greet("Rajesh");

        //Single line Lambda
        GreetingService Single = (name) -> name.toUpperCase();
        System.out.println(Single.greet("rajeshganessan"));

//        //Multi line Lambda
//        GreetingService Multi = (name,age,weight) -> {
//            System.out.println("Changing to Uppercase :: " + name.toUpperCase());
//            System.out.println("length of name is " + name.length());
//            System.out.println("Age of " + name + " is " +age);
//            System.out.println("Weight of " +name + "is " + weight);
//        };
//
//        Multi.greet("Rajesh",24,75);
    }

}
