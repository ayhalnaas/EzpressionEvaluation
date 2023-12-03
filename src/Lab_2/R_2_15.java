package Lab_2;

import Lab_1.CreditCard;
//basmala alnaas
public class R_2_15 extends CreditCard {
    public R_2_15(double lim) {
        super(lim);
    }
    public void makePayment(double amount){
        if (amount<0) {
            throw new IllegalArgumentException("Don\'t allows enter amount is negative");
        }
        balance -= amount;
    }
}
