package StreamTerminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NoneAndAnyMatch {

    public static void main(String[] args) {

        System.out.println("Min and Max operator");

        List<String> vehicles = Arrays.asList("Bike", "car", "Truck", "Chopper","flight");

        //will return the true as  B is there
        System.out.println(
                vehicles.stream()
                        .anyMatch(s -> s.contains("B"))
        );

        System.out.println(
                vehicles.stream()
                        .noneMatch(s -> s.contains("C"))
        );
    }
}
