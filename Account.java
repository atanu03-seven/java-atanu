class MinimumBalanceException extends Exception {
    MinimumBalanceException(String msg) {
        super(msg);
    }
}
class Account {
    String name;
    int acc_no;
    double balance;
    Account(String n, int a, double b) {
        name = n;
        acc_no = a;
        balance = b;
    }
    void deposit(double amt) {
        balance += amt;
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amt) throws MinimumBalanceException {
        if (balance - amt < 500)
            throw new MinimumBalanceException("Balance below 500 not allowed");
        balance -= amt;
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Account a1 = new Account("Ravi", 101, 1000);
        try {
            a1.withdraw(600);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

