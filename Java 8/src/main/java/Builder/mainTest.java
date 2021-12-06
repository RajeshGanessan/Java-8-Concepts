package Builder;

public class mainTest {

    private static buildTest EmpDetails;

    public static void main(String[] args) {

       EmpDetails =  buildTest.getDetails();
        System.out.println(EmpDetails.getEmpEmail());

    }
}
