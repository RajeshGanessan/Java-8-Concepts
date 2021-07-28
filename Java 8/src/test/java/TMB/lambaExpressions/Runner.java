package TMB.lambaExpressions;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Lambda expression");

        Printable print = (text) -> text.length()>0;
        System.out.println(print.print("good morning"));
    }
}
