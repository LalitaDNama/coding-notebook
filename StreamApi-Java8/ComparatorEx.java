import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

    public static void comparator(){
        List<String> names= Arrays.asList("Java","C","Python","Go");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
