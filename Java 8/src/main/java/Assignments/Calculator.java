package Assignments;

import Lamba.MathOperation;

import java.util.HashMap;
import java.util.Map;

public class Calculator {


    private static final Map<String, MathOperation> operationsMap = new HashMap<>();

    static {
        operationsMap.put("+", (a, b) -> a + b);
        operationsMap.put("-", (a, b) -> a - b);
        operationsMap.put("*", (a, b) -> a * b);
        operationsMap.put("/", (a, b) -> a / b);
    }


    //Adding new operation
    public static void addOperation(String key, MathOperation operation){
        operationsMap.put(key,operation);
    }

    // Mathoperations
    public static int calculate(int onScreenNumber,MathOperation mathOperation,int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
    }


    //calculating
    public static int calculate(String expression){
        String[] values = expression.split(" ");
        int OnScreenNumber = Integer.parseInt(values[0]);
        for (int i = 1; i < values.length; i = i+2) {
            MathOperation operation = operationsMap.get(values[i]);
            int number = Integer.parseInt(values[i+1]);
            OnScreenNumber = calculate(OnScreenNumber,operation,number);
        }
        return OnScreenNumber;
    }
}

