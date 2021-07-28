package TMB.Lambda;

@FunctionalInterface
public interface Iprintable {

    void print();

    default void printToConsole() {
        System.out.println("Default method");
    }

    static void sampleStatic(){
        System.out.println("sample static method");
    }

}
