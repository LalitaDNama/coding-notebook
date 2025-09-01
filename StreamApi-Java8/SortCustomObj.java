import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortCustomObj {

    static List<Person> personList= Arrays.asList(
            new Person("john",22),
            new Person("adams",25),
            new Person("john",23)
    );
    public static void sortCustomObjByName(){
        List<Person>result=personList.stream().sorted(Comparator.comparing(Person::getName)).toList();
        result.forEach(p->System.out.println(p.getName()+" "+p.getAge()));
    }
    public static void sortCustomObjByNameAndAge(){
        List<Person>result=personList.stream().sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge)).toList();
        result.forEach(p->System.out.println(p.getName()+" "+p.getAge()));
    }
}
