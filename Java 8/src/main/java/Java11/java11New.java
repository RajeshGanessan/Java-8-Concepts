package Java11;

public class java11New {

    public static void main(String[] args) {

        System.out.println("IsBlank method");

        String str = "rajesh\n ganessan";

        //returns true if string is without any characters ex: space is considered so will return false
        System.out.println(str.isEmpty());

        //returns true only if string does not contain anyting
        System.out.println(str.isBlank());
        str.lines().forEach(System.out::println);

        str.repeat(5);
        }
}
