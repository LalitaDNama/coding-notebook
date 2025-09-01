import java.util.Arrays;
import java.util.List;

public class FlatMap {

    public static void flatMap(){
        List<List<Integer>> flatMapList= Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,3,5));
        flatMapList.stream().flatMap(List::stream).forEach(System.out::println);
    }
}
