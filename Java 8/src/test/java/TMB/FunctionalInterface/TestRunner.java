package TMB.FunctionalInterface;

import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class TestRunner {

    public static void main(String[] args) {

        PrintableGenerics printObj = (t) -> System.out.println("Printing the value = " + t);
        printObj.printOutput(14.56);

        MultipleGenericsInterface<Integer,Integer, Integer> multipleObj = (a,b) -> a+b;
        System.out.println(multipleObj.printConsole(1,8));

        Animal animal = () -> System.out.println("Calling using lambda function");
        animal.run();

        StringOperation((s) -> System.out.println(s.toLowerCase()));
    }

    private static void StringOperation(Consumer<String> consumer){
        String text = "wOrlD";
        consumer.accept(text);
    }
}
