package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {


    public static void main(String[] args) {


        List<Integer> a = Arrays.asList(1,3,5);
        List<Integer> b = Arrays.asList(4,6,8);
        List<Integer> c = Arrays.asList(9,8,7);

        List<List<Integer>> listsOflists = Arrays.asList(a,b,c);


               listsOflists.stream()
                            .flatMap(l -> l.stream())
                            .map(i -> i * i)
                            .forEach(l -> System.out.println(l));

    }
}
