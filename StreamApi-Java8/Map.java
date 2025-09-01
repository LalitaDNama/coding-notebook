import java.util.Arrays;
import java.util.List;

public class Map {

    public static void map(){
        List<Integer> numbers= Arrays.asList(1,2,3);
        numbers.stream().map(n->n*2).forEach(System.out::println);
    }

    public static void getStringLength(){
        List<String> names=Arrays.asList("Lalita","shirisha","arati");
        names.stream().map(String::length).forEach(System.out::println);
    }
    public static void getSum(){
        List<Integer> numbers= Arrays.asList(1,2,3);
        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
