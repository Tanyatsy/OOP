import java.util.Arrays;
import java.util.Stack;

public class BracketsChecker{ //bracketschecker

    String expression;

    BracketsChecker(String expression){
        this.expression = expression;
    }

    private static boolean isEqual(char bracket, char peek){
        return bracket == '}' && peek == '{' || bracket == ')' && peek == '(' || bracket == ']' && peek == '[';
    }


    public boolean isBalanced() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char bracket = expression.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);

            }
            if (bracket == '}' || bracket == ']' || bracket == ')') {
                if  (stack.isEmpty()) {return true;}
                else
                if (isEqual(bracket,stack.peek())) { //boolean function in if
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

       // System.out.println(Arrays.toString(stack.toArray()));
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
