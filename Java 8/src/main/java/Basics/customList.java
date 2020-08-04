package Basics;

import java.util.ArrayList;

public interface customList {

    void printSize();
    int getCount();
    int getValue(int index);
    void add(int value);

    default void forEach(ArrayList<String> list){

        for(String i :list){
            System.out.println(i);
        }
    }
}
