package Builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class buildTest {

    private String empName;
    private int empAge;
    private String empEmail;


    public static buildTest getDetails(){
        return buildTest.builder().empName("rajesh")
                .empAge(25)
                .empEmail("rajesh@gmail.com")
                .build();
    }
}
