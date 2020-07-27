package Comparator;

import org.openqa.selenium.json.JsonOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumUsingInstream {

    public static void main(String[] args) {

        System.out.println("sum using Instream");

        List<Integer> myList = new ArrayList<>();

        Collections.addAll(myList,1,3,4,5,5,9,32,43);

        myList.forEach(System.out::println);

        int sum = myList.stream().mapToInt(a -> a )
                                .sum();
        System.out.println(sum);

    }
}
