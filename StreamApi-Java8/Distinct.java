import java.util.Arrays;
import java.util.List;

public class Distinct {

    public static void distinct(){
        List<Integer> list= Arrays.asList(1,2,3,3,2,2,4);
        list.stream().distinct().forEach(System.out::println);
    }
}
