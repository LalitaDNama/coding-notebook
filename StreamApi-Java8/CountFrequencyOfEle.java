import java.util.*;
import java.util.stream.Collectors;

public class CountFrequencyOfEle {

    public static void countFrequency(){
        List<String> names= Arrays.asList("Java","Python","Python");

        names.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
    }
}
