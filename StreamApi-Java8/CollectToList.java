import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToList {

    public static void collectToList(){
        List<Integer> list= Arrays.asList(1,2,4,3,4);
        Set<Integer> result=list.stream().map(n->n*2).collect(Collectors.toSet());
        System.out.println(result);
    }
}
