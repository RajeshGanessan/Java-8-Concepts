package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.*;

public class Collectors {

    public static void main(String[] args) {


        System.out.println("Collectors");

        List<String> myList = Arrays.asList("Apple","Hero","Airplane","Car","Tesla","Rolls");


        Set<String> newList = myList.stream()
                                    .filter(s -> s.length() > 3)
                                    .collect(java.util.stream.Collectors.toSet());

        Map<Integer,List<String>> resultMap = grouping(myList);


        System.out.println("Old list :: " + myList);
        System.out.println("New List :: " + newList);
        System.out.println("My Map :: " + resultMap);

    }

    private static Map<Integer,List<String>> grouping(List<String> list){

        Map<Integer,List<String>> myMap;
        myMap = list.stream()
                .collect(java.util.stream.Collectors.groupingBy(s -> s.length()));
        return myMap;
    }

    }

