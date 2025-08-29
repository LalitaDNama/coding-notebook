import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueChar {

    public static char getFirstUnique(String string){
        Map<Character,Integer> count=new HashMap<>();

        for(char c:string.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(char c:string.toCharArray()){
            if(count.get(c)==1)
                return c;
        }

        throw new IllegalArgumentException("No unique character present in the array");
    }
}
