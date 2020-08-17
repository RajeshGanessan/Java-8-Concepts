package java9;

import java.util.List;

public class ImmutableList {

    public static void main(String[] args) {

        System.out.println("Creating a Immutable List");

        List<Integer> integers = List.of(3, 4, 10, 11, 8, 9);

        System.out.println(integers);
    }
}
