package Basics;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        String vehicleMonthOne = "Jan,Feb,Mar,Sep";
        ArrayList<String> weeksarray = new ArrayList<String>();
        String excel_Month = "Sep";
        if(vehicleMonthOne!="nill") {
            String[] month_Splits = vehicleMonthOne.split(",");
            System.out.println("The excel month is "+vehicleMonthOne);
            for(String month_Constraint : month_Splits) {
                System.out.println("The month fetched from excel is " + excel_Month);
                if (month_Constraint.equalsIgnoreCase(excel_Month)) {
                    System.out.println("Months matched");
                    String month_Weeks_Column_Excel = "first,second,third";
                    System.out.println("The columns of the month fetched from excel is " + month_Weeks_Column_Excel);
                    String[] weeks_Column = month_Weeks_Column_Excel.split(",");
                    for(int j=0;j<weeks_Column.length;j++){
                        System.out.println("Column to verify data are "+weeks_Column[j]);
                    weeksarray.add(weeks_Column[j]);
                    }
                }
            }
            System.out.println(weeksarray);
        }
        else {
            System.out.println("The no months passed");
        }
    }
}
