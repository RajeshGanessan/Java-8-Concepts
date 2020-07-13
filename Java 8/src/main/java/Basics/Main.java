package Basics;

public class Main {

    public static void main(String[] args) {


        Iphone iphone = new Iphone();
        clock cl = new clock();

        iphone.setAlarm();
        cl.setAlarm();

    }

    private static void SetAlarm(Alarm a){

        a.setAlarm();
    }
}
