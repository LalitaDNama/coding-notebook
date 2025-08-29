import java.util.Stack;

public class Parenthesis {

    public static boolean isValidParanthesis(String string){
        Stack<Character> stackOfChar=new Stack<>();
        for(char c:string.toCharArray()){
            stackOfChar.push(c);

            if(c=='{' || c=='(' || c=='[')
                stackOfChar.push(c);
            else if(c==')' && !stackOfChar.isEmpty() && stackOfChar.peek()=='(')
                stackOfChar.pop();
            else if(c==']' && !stackOfChar.isEmpty() && stackOfChar.peek()=='[')
                stackOfChar.pop();
            else if(c=='}' && !stackOfChar.isEmpty() && stackOfChar.peek()=='{')
                stackOfChar.pop();
            else
                return false;
        }
        return stackOfChar.isEmpty();
    }
}
