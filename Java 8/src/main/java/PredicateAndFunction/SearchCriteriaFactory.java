package PredicateAndFunction;

import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class SearchCriteriaFactory {

   private static Predicate<List<WebElement>> allMale = (element) -> element.get(1).getText().equalsIgnoreCase("male");
   private static Predicate<List<WebElement>> allFemale = (element) -> element.get(1).getText().equalsIgnoreCase("female");
   private static Predicate<List<WebElement>> australia = (element) -> element.get(2).getText().equalsIgnoreCase("au");


   private static Map<String, Predicate<List<WebElement>>> searchMap = new HashMap<>();

   static{
       searchMap.put("allmale",allMale);
       searchMap.put("allfemale",allFemale);
       searchMap.put("australia",australia);
   }

   public static Predicate<List<WebElement>> getCriteria(String criteriaName){

       return searchMap.get(criteriaName);
   }
}
