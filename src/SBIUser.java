import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name;
    private String accNo;
    private double balance;
    private String password;
    static double rateOfInterest;


    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

//        bank initialization

        this.rateOfInterest = 7;
        this.accNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String AddMoney(int amount) {
        balance = balance + amount;
        return "Total amount present is : " + balance;
    }

    @Override
    public String withDraw(int amount, String EnteredPassword) {
        if(Objects.equals(EnteredPassword,password))
        {
            if(amount > balance)
            {
                return "Insufficient balance";
            }
            else {
                balance = balance - amount;
                return "Nice man Good amount and the balance amount is : "+ balance;
            }
        }
        else {
            return " Check your Password";
        }
    }

    @Override
    public double claculateInterest(int years) {

        return (balance * years * rateOfInterest) / 100;
    }
}
