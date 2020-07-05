package concurrency.demo7;

public class Account {
    
    private long balance;
    
    public Account() {
        this(0L);
    }
    
    public Account(long balance) {
        this.balance = balance;
    }
    
    public long getBalance() {
        return balance;
    }
    
    public void deposit(long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
    }

    public void withdraw(long amount) {
        checkAmountNonNegative(amount);
        if (balance < amount) {
            throw new IllegalArgumentException("Not enough money");
        }
        balance -= amount;
    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        }
    }
}
