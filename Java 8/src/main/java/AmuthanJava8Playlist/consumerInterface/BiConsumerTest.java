package AmuthanJava8Playlist.consumerInterface;

import lombok.Builder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    private static BiConsumer<String,String> loop = (a,b) -> System.out.println(a + " " + b);

    static  Map<String,String> details = new HashMap<>();

    static {
        details.put("test","test1");
        details.put("test2","testt2");
        details.put("test3","testt3");
    }
    public static void main(String[] args) {

        details.forEach(loop);
        details.entrySet().forEach(System.out::println);

    }
}
