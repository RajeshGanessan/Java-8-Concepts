package PredicateAndFunction;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Rules {


    private static Predicate<WebElement> isBlank = (e) -> e.getText().trim().length()==0;
    private static Predicate<WebElement> isContainsS = (e) -> e.getText().toLowerCase().contains("s");



    public static List<Predicate<WebElement>> get(){

        List<Predicate<WebElement>> rule = new ArrayList<>();
        rule.add(isBlank);
        rule.add(isContainsS);
        return rule;
    }

    public static  Predicate<WebElement> getIsBlank(){

        return isBlank;
    }

    public static Predicate<WebElement> getIsContainsS() {
        return isContainsS;
    }



}
