package ass4singlylinkedlist;

import static java.lang.Character.isDigit;

//q3,q5 lab7
public class PostfixEvaluation {

    static Linkedstack<Float> stk = new Linkedstack<>();
    public static Float MathOperation ( Float op1 , Float op2 ,char operation ) {
        switch (operation) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '*': return op1 * op2;
            case '/': if(op2 != 0) return op1 / op2;
        }
        return  new Float(-1);

    }
    public static float postfix_evaluation(String exp){
        char[] parts = exp.toCharArray();

        for (int i = 0; i < exp.length(); i++) {
            if (isDigit(parts[i])) {
                stk.push((float) parts[i] -'0');
            }
            else {
                float op2 = stk.top();
                stk.pop();

                float op1 = stk.top();
                stk.pop();

                float result = MathOperation(op1,op2,parts[i]);
                stk.push(result);
            }
        }
        return stk.top();
    }

    public static void main(String[] args) {
        String PostfixExpression = "52+83-*4/";
        System.out.println(postfix_evaluation(PostfixExpression));
    }

}
