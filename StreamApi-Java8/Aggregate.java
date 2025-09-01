import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Aggregate {

    public static void getAverage(){
        List<Integer> avg= Arrays.asList(1,2,3,4,5,6,7);
        Double resut=avg.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(resut);
    }
    public static void getCount(){
        List<Integer> numbers= Arrays.asList(1,2,3);
        System.out.println(numbers.stream().count());
    }
}
