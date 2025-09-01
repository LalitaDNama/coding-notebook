import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void groupBy(){
        List<String> names= Arrays.asList("String","Static","Booblen","Bold");
        names.stream().collect(Collectors.groupingBy(c->c.charAt(0)))
                .entrySet().stream()
                .forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
    }
}
