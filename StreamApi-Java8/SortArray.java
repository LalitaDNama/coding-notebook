import java.util.*;

public class SortArray {

    public static void sortArray(){
        List<Integer> list= Arrays.asList(5,3,6,2,1);
        list.stream().sorted().forEach(System.out::println);
    }
}
