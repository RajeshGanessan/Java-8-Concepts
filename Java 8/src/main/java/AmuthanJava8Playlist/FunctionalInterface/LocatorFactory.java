package AmuthanJava8Playlist.FunctionalInterface;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public final class LocatorFactory {


    private static Map<String, Function<String, By>> locatorMap = new HashMap<>();

    private static Function<String,By> XPATH = By::xpath;
    private static Function<String,By> ID = By::id;
    private static Function<String,By> NAME = By::name;

    static {
        locatorMap.put("xpath",XPATH);
        locatorMap.put("id",ID);
        locatorMap.put("name",NAME);
    }

    public static By getLocator(String locatorType,String value){
        return locatorMap.get(locatorType).apply(value);
    }
}
