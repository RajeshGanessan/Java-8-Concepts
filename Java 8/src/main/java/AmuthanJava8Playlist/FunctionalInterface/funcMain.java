package AmuthanJava8Playlist.FunctionalInterface;

public class funcMain {

    public static void main(String[] args) {
        System.out.println("Generic Interface methods ");

        genericInterface<String> test = s -> System.out.println("This is the " + s);
        test.printValue("Earth");
    }
}
