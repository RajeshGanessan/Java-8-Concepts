package AmuthanJava8Playlist.lambda;

import java.util.function.Consumer;

public class lambdaParam {

//    private static Consumer<Integer> addition = (a,b) -> return a+b;
    public static void main(String[] args) {

        stringOps((s) -> System.out.println(s.toLowerCase()),"PAVI");

    }

    private static void stringOps(Consumer<String> consumer,String data){
        consumer.accept(data);
    }

}
