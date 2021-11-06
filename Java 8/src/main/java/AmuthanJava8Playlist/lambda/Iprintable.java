package AmuthanJava8Playlist.lambda;


@FunctionalInterface
public interface Iprintable {

     String print(String text);

     default void printToConsole(String printText) {
          System.out.println(printText + " additional text");
     }

     static void printStatic(){
          System.out.println("static");
     }
}
