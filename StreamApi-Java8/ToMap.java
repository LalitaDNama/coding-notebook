import java.util.*;
import java.util.stream.Collectors;

public class ToMap {

    public static void convertToMap(){
        List<String> names = Arrays.asList("Alice", "Bob");
        names.stream().collect(Collectors.toMap(n -> n, String::length)).forEach((k,v)->System.out.println(k+" "+v));
    }
}
