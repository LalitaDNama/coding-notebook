import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindDuplicateEle {

    public static void findDuplicateElements(){
        List<Integer> list= Arrays.asList(10,20,10,30,40,20);
        list.stream().filter(n-> Collections.frequency(list,n)>1)
                .distinct()
                .forEach(System.out::println);
    }
}
