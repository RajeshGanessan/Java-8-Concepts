package MainClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Rajesh");
        list.add("Ganessan");

        //Consumer Interface examples
        Consumer<String> logConsumer = (s) -> System.out.println(s.toUpperCase().concat("123"));

        Consumer<String> dbConsumer = (s) -> System.out.println(s);

        Consumer<String> dblogConsumer = logConsumer.andThen(dbConsumer);

        //BiConsumer Interface Examples:
        BiConsumer<String, Integer> biConsumer = (a,b) -> {
            System.out.println("My name is " + a);
            System.out.println("My age is " + b);
        };


        Map<String, Consumer<String>> consumerMap = new HashMap<>();

        consumerMap.put("log" , logConsumer);
        consumerMap.put("db", dbConsumer);
        consumerMap.put("dblog",dblogConsumer);

        consumerMap.forEach((k,v) -> {
            System.out.println(" Key is " + k);
        });

        //list.forEach(dblogConsumer);
        biConsumer.accept("rajesh",26);

        }
}
