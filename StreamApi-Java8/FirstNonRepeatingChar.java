public class FirstNonRepeatingChar {

    public static void getFirstNonRepeatingChar(){
        String name="ababcd";

        char result=name.chars()
             .mapToObj(c->(char)c)
             .filter(c->name.indexOf(c)==name.lastIndexOf(c))
             .findFirst()
             .orElseThrow();

        System.out.println(result);
    }
}
