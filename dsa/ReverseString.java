public class ReverseString {

    public static String reverseString(String string){
        String rvs="";

        for(int i=string.length()-1;i>=0;i--){
            rvs+=string.charAt(i);
        }
        return rvs;
    }

}
