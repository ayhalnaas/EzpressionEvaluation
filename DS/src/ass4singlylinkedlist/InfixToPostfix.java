package ass4singlylinkedlist;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class InfixToPostfix {

    static Linkedstack<Character> stk = new Linkedstack<>();

    public static int priority(char c){
         if (c == '+' || c == '-')return 1;
         else if (c == '*' || c == '/')return 2;

        else return 0;
    }

    public static String infix_to_postfix(String exp) {
        char[] parts = exp.toCharArray();


        String output = " ";
        for (int i = 0; i < exp.length(); i++) {
            if (parts[i] == ' ') continue;

            if (isDigit(parts[i])||isLetter(parts[i])) output+= parts[i];
            else if (parts[i]== '(') stk.push('(');
            else if (parts[i]== ')') {
                while (stk.top() != '(' ){
                    output += stk.top();
                    stk.pop();
                }
                stk.pop();
            }
            else {
                while (! stk.isEmpty() && priority(parts[i]) <= priority(stk.top())){
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
        return output;
    }

    public static void main(String[] args) {
        String infixExpression = ("((5+2)*(8-3))/4");
        System.out.println(infix_to_postfix(infixExpression));

    }

}

