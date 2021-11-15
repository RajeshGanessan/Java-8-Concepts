package AmuthanJava8Playlist.lambda;


public class lambdaExpressions {

    public static void main(String[] args) {

        System.out.println("lambda expressions");

//        Iprintable iprintable = (text) -> "Good morning" ;
//        System.out.println( iprintable.print("hey!") + " this is lambda expression");


        //returning something boolean or a string
//        Iprintable print = text -> {
//            if(text.equals("good"))
//                return true;
//            else
//                return false;
//        };
//        System.out.println(print.print("good"));


        Iprintable test = s -> s.toLowerCase();
        System.out.println(test.print("GOOD MORNING"));



    }
}