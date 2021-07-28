package TMB.FunctionalInterface;

@SuppressWarnings("ALL")
public class TestRunner {

    public static void main(String[] args) {

        PrintableGenerics printObj = (t) -> System.out.println("Printing the value = " + t);
        printObj.printOutput(14.56);

        MultipleGenericsInterface<Integer,Integer, Integer> multipleObj = (a,b) -> a+b;
        System.out.println(multipleObj.printConsole(1,8));
    }
}
