package Streams;

import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SquareNumbers {

    public static void main(String[] args) {

        System.out.println("Finding the square of the even numbers");

        List<Integer> Numbers = new ArrayList<>();

        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(6);
        Numbers.add(7);
        Numbers.add(8);
        Numbers.add(10);
        Numbers.add(12);

        for (int i = 0; i < Numbers.size(); i++) {
            int num = Numbers.get(i);
            if (num % 2 == 0) {
                int square = num * num;
                System.out.println("Square of " + num + " :" + square);
            }
        }


//        //using Streams - with debug
//        System.out.println("Using Streams to find square");
//        Numbers.stream()
//                .filter(i -> {
//                    System.out.println("filter received :" + i);
//                    return i % 2 == 0;
//                })
//                .limit(3)
//                .sorted()
//                .map(i -> {
//                    System.out.println("Map recieved :" + i);
//                    return i * i;
//                })
//                .forEach(i -> System.out.println(" Square is :" + i));

//        //Using streams - Main concepts
//        System.out.println("Using streams ");
//        Numbers.stream()
//                .filter(i -> i % 2 == 0)
//                .skip(3)
////                .peek(i -> System.out.println("Filter received " + i))
//                .limit(3)
////                .peek(i -> System.out.println("Map received " + i))
//                .map( i -> i * i)
//                .forEach(i -> System.out.println(" Square of :" + i));


        //using streams - Different scenario
        System.out.println("Using streams  - different scenario");
        Numbers.stream()
                .filter(i -> i % 2 == 0 && i > 5)
                .map(i -> i * i)
                .forEach(i -> System.out.println("Square is :" + (i+2)));
    }


}
