package Banking;

public class Account {

    private long accNumber;
    private String holderName;
    private double balance;
    private String pin;


    public Account(long accNumber, String holderName, double balance) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return this.pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public long getAccNumber() {
        return this.accNumber;
    }
}