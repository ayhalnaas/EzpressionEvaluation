package Lab_2;

import Lab_1.CreditCard;
//ayh alnaas
public class Throw extends CreditCard {
    public Throw(double lim) {
        super(lim);
    }

    public void makePayment(double amount){
        if (amount<0) {
            throw new IllegalArgumentException("Don\'t allows enter amount is negative");
        }
       balance -= amount;
    }
}
