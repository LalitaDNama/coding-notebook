import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionEvenOdd {

    public static void partitionBy(){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        list.stream().collect(Collectors.partitioningBy(n->n%2==0))
                .entrySet().stream()
                .forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
    }
}
