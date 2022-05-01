package calculate;

import java.util.Stack;

public class calculate {
    static Stack<String> stack = new Stack<>();

    private static double compute(Character c, Double a, Double b){
        if (c == '+'){
            return a+b;
        } else if (c == '-'){
            return a-b;
        } else if (c == '*'){
            return a*b;
        } else if (c == '/'){
            return a/b;
        }
        return 0;
    }

    public static double calculate(String input){
        String a, b, tmp = "";
        double temp = 0;

        for (int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);
            if(c == ' ') {
                stack.push(tmp);
                tmp = "";
            } else if (Character.isLetterOrDigit(c) || c == '.') {
                tmp += c;
            } else {
                b = stack.pop();
                a = stack.pop();
                temp = compute(c, Double.valueOf(a), Double.valueOf(b));
                stack.push(String.valueOf(temp));
                i++;
            }
        }
        return Double.valueOf(stack.pop());
    }
}
