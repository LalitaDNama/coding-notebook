import java.util.Arrays;
import java.util.List;

public class MinMaz {

    static List<Integer> list= Arrays.asList(3,4,2,5,1);
    public static void minMax(){
        int min=list.stream().min(Integer::compare).orElseThrow();
        int max=list.stream().max(Integer::compare).orElseThrow();
        System.out.println("Min: "+min+" Max: "+max);
    }
}


