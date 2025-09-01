import java.util.Arrays;
import java.util.List;

public class Reduce {

    public static void reduce(){
        List<Integer> list= Arrays.asList(1,2,3,4);
        Integer sum=list.stream().map(n->n*2).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
