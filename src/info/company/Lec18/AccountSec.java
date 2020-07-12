package info.company.Lec18;

public class AccountSec {

    private long balance;

    private String name;

    public AccountSec() {
        this.balance = 999999999;

        this.name = "Second Ambani";
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance (long balance) {
        this.balance = balance;
    }
}

