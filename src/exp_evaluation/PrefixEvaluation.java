package exp_evaluation;
import static java.lang.Character.isDigit;

import java.lang.String;

public class PrefixEvaluation {
    static LinkedStack<Float> stk = new LinkedStack<>();
    public static Float MathOperation ( Float op1 , Float op2 ,char operation ) {
        switch (operation) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/': if(op2 != 0) return op1 / op2;
        }
        return  new Float(-1);

    }
    public static float prefix_evaluation(String exp){
        char[] parts = exp.toCharArray();

        for (int i = exp.length() -1; i >=0; i--) {
            if (isDigit(parts[i])) {
                stk.push((float) parts[i] -'0');
            }
            else {
                float op1 = stk.top();
                stk.pop();

                float op2 = stk.top();
                stk.pop();

                float result = MathOperation(op1,op2,parts[i]);
                stk.push(result);
            }
        }
        return stk.top();
    }

    public static void main(String[] args) {
        String PrefixExpression = "+3-72";
        System.out.println(prefix_evaluation(PrefixExpression));
    }

}
