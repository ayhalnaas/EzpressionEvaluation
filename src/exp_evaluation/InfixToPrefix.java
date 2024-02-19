package exp_evaluation;
import java.lang.String;
import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class InfixToPrefix {

    static LinkedStack<Character> stk = new LinkedStack<>();

    public static int priority(char c){
        if (c == '+' || c == '-')return 1;
        else if (c == '*' || c == '/')return 2;

        else return 0;
    }
    public static String reverse (String exp){
        char[] parts = exp.toCharArray();
        String output = " ";
        for (int i = exp.length() - 1; i >= 0; i--) {
            if (parts[i] == ' ') continue ;
            else {
                stk.push(parts[i]);
                output += stk.top();
                stk.pop();
            }

        }return output;
    }
    public static String infix_to_prefix(String exp) {
        char[] parts = exp.toCharArray();

        String output = " ";
        for (int i = exp.length() - 1; i >= 0; i--) {
            if (parts[i] == ' ') continue;

            if (isDigit(parts[i])||isLetter(parts[i])) output+= parts[i];
            else if (parts[i]== ')') stk.push('(');
            else if (parts[i]== '(') {
                while (stk.top() !='(' ){
                    output += stk.top();
                    stk.pop();
                }
                stk.pop();
            }
            else {
                while (! stk.isEmpty() && priority(parts[i])<= priority(stk.top())){
                    output += stk.top();
                    stk.pop();
                }
                stk.push(parts[i]);
            }



        }
        while (!stk.isEmpty()){
            output += stk.top();
            stk.pop();
        }
        return reverse(output);
    }

    public static void main(String[] args) {
        String infixExpression = ("4*(3+9)");
        System.out.println(infix_to_prefix(infixExpression));

    }


}
