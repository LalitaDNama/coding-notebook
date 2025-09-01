import java.util.Arrays;
import java.util.List;

public class TopNHighestNbr {

    public static void getTopNHighestNbr(){
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
