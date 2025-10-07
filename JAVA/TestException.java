class InsufficientBalance extends RuntimeException {
    public InsufficientBalance(String msg) {
        super(msg);
    }
}

public class TestException {
    public static void main(String[] args) {
        int balance = 1000;

        if (balance < 500) {
            throw new InsufficientBalance("Insufficient Balance In Your Account: " + balance);
        } else {
            System.out.println("Withdrawal Successful. Balance: " + balance);
        }
    }
}
