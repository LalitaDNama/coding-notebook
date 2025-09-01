import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Peek {

    public static void peek(){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Set<Integer> result=list.stream().peek(System.out::println).map(n->n*2).collect(Collectors.toSet());
    }
}
