public class CreditCard {
    //1-Modify the CreditCard class from Code Fragment 1.5 to
    // include a method that updates the credit limit.
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
        public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
            customer = cust;
            bank = bk;
            account = acnt;
            limit = lim;
            balance = initialBal;
           }
        public CreditCard(String cust, String bk, String acnt, int lim) {
            this(cust, bk, acnt, lim, 0.0);
           }

    public String getCustomer( ) { return customer; }
    public String getBank( ) { return bank; }
    public String getAccount( ) { return account; }
    public int getLimit( ) { return limit; }
    public double getBalance( ) { return balance; }
    public boolean charge(double price) {
            if (price + balance > limit){
                return false; }
            balance += price;
            return true;
             }
    //2-Modify the CreditCard class from Code Fragment 1.5 so that it ignores
    // any request to process a negative payment amount.
    public void makePayment(double amount) {  balance -= amount;
             }
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit); //
    }
    //3-Modify the declaration of the first for loop
    // in the main method in Code Fragment 1.6 so that
    // its charges will cause exactly one of
    // the three credit cards to attempt to go over its credit limit.
    // Which credit card is it?
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("ayh", "iii",
                "4569727", 4000);
        wallet[1] = new CreditCard("sara", "kkk",
                "4576321117", 4000);
        wallet[2] = new CreditCard("ahmed", "lll",
                "33845845", 4000, 120);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }
        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
    }

            }
        }