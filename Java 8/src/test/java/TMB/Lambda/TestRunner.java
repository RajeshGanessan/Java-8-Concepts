package TMB.Lambda;

public class TestRunner {

    public static void main(String[] args) {

        //conventional way
    Iprintable obj = new logImpl();

    obj.print();

    //implementing behaviour at runTime(annonymours inner class)
        Iprintable obj2 = new Iprintable() {
            @Override
            public void print() {
                System.out.println("annonymmous class");
            }
        };

    obj2.print();


    //functional programming way using lambda
    Iprintable objLambda = () -> System.out.println("I'm a Lambda expression");
    objLambda.print();
    objLambda.printToConsole();
    }
}
