public class Palindrome {

    public static boolean isPalindrome(String string){
        int left=0,right=string.length()-1;
        while(left<right){
            if(string.charAt(left)!=string.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
