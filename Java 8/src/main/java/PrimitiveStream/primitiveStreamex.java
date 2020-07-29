package PrimitiveStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class primitiveStreamex {

    public static void main(String[] args) {


        System.out.println("primitive Stream");

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list,2,4,5,1,3,12,54,67);
        double sum = list.stream()
                .mapToDouble(a -> a)
                .count();

        System.out.println(sum);
    }
}
