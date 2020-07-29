package Basics;

import java.util.ArrayList;
import java.util.List;

public class customArrayList implements customList{

    private List<Integer> list =  new ArrayList<>();
    @Override
    public void printSize() {
        System.out.println();
    }

    @Override
    public int getCount() {
        return list.size() ;
    }

    @Override
    public int getValue(int index) {
        return list.get(index);
    }

    @Override
    public void add(int value) {
        list.add(value);
    }

}
