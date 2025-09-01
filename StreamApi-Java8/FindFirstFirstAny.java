import java.util.Arrays;
import java.util.List;

public class FindFirstFirstAny {

    static List<Integer> list= Arrays.asList(1,2,3,4);

    public static void findFirst(){
        System.out.println(list.stream().findFirst().orElse(-1));
    }
    public static void findAny(){
        System.out.println(list.stream().findAny().orElse(-1));
    }
}
