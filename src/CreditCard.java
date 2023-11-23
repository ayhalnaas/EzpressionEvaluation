public class CreditCard {
    //1-Modify the CreditCard class from Code Fragment 1.5 to
    // include a method that updates the credit limit.

    private double limit;
    protected double balance;
        public CreditCard(double lim) {
            this.limit = lim;
            this.balance = 0.0;
           }
        public void  updates_the_credit_limit(double new_limit){
            this.limit = new_limit;
        }

    public double getBalance() {
        return balance;
    }

    //2-Modify the CreditCard class from Code Fragment 1.5 so that it ignores
    // any request to process a negative payment amount.
    public void process_Payment_amount(double amount) {
            if (amount > 0){
            balance -= amount;
             }}
    public void process_purchase(double amount) {

            balance += amount;
        }
    //3-Modify the declaration of the first for loop
    // in the main method in Code Fragment 1.6 so that
    // its charges will cause exactly one of
    // the three credit cards to attempt to go over its credit limit.
    // Which credit card is it?
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard(4000);
        wallet[1] = new CreditCard(500);
        wallet[2] = new CreditCard(6000);

        for (int val = 1; val <= 16; val++) {
            wallet[0].process_purchase(100);
            wallet[1].process_purchase(10);
            wallet[2].process_purchase(1000);
        }
        wallet[2].process_Payment_amount(1000);

        for (CreditCard card : wallet) {

                System.out.println("Balance = " + card.getBalance());
            }
    }

            }
