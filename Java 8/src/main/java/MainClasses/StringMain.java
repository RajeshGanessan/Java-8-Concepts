package MainClasses;

import Lamba.StringOperatios;

import java.util.ArrayList;
import java.util.List;


public class StringMain {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

//        StringOperatios str = String::toUpperCase;
        list.add("");
//        StringOperatios str = (n) -> list.add(n);
        StringOperatios str = list::add;

//        System.out.println(str.accept("Rajesh"));
        str.accept("Ganessan");

        System.out.println(list);
    }
}
