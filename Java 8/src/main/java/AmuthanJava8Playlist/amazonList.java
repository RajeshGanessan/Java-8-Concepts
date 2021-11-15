//package AmuthanJava8Playlist;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.*;
//
//public class amazonList {
//
//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.amazon.in");
//
//        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//
////        Set<String> validLinks = new HashSet<>();
////        for (WebElement link: allLinks) {
////            validLinks.add(link.getText());
////        }
////
////        List<String> sorted = new ArrayList<>(validLinks);
////        Collections.sort(sorted);
////
////        sorted.forEach(System.out::println);
////        driver.quit();
//
//
//        allLinks.stream()
//                .map(e ->e.getText())
//                .distinct()
//                .sorted()
//                .filter(s -> s.startsWith("C") || s.startsWith("D"))
//                .forEach(System.out::println);
//
//        driver.quit();
//    }
//}
