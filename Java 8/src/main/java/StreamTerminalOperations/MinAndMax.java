package StreamTerminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {

    public static void main(String[] args) {


        System.out.println("Min and Max operator");

        List<String> vehicles = Arrays.asList("Bike", "car", "Truck", "Chopper","flight");

        //will return the first element after ascending order
        System.out.println(
                vehicles.stream()
                .min(Comparator.naturalOrder())
                .get()
        );

        //will return the last element  after descending order as it is reverse order
        System.out.println(
                vehicles.stream()
                    .max(Comparator.reverseOrder())
                    .get()
        );


    }
}
