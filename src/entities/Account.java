package entities;

public class Account {
    private int AcNumber;
    private String Name;
    private String Password;
    private double Balance;

    public Account(int acNumber, String name, String password, double balance) {
        AcNumber = acNumber;
        Name = name;
        Password = password;
        Balance = balance;
    }

    public int getAcNumber() {
        return AcNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance){
        Balance = balance;
    }

    @Override
    public String toString() {
        return Name + ", " + AcNumber + ", " + "R$: " + Balance;
    }
}
