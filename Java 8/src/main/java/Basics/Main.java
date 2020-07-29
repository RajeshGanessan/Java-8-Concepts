package Basics;

public class Main {

    public static void main(String[] args) {


        Iphone iphone = new Iphone();
        clock cl = new clock();

        iphone.setAlarm();
        cl.setAlarm();


        customArrayList arrayList = new customArrayList();
        arrayList.add(10);
        arrayList.forEach(arrayList);

    }



    private static void SetAlarm(Alarm a){

        a.setAlarm();
    }
}
