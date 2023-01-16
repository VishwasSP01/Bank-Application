import java.util.Scanner;
import java.util.UUID;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NAME , Initial Balance and Password");
        System.out.println("These are required to create an account");

        String name = sc.next();
        double balance = sc.nextDouble();
        String password = sc.next();
        System.out.println("The account number of this new SBI user is : " + String.valueOf(UUID.randomUUID()));

//        now creating an object for SBIUser

        SBIUser user = new SBIUser(name,balance,password);

        String message = user.AddMoney(100);
        System.out.println(message);

        System.out.println("Enter the amount that you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter the Password");
        String pass = sc.next();
        System.out.println(user.withDraw(money,pass));

        System.out.println("Bro the rate of interest is : "+user.claculateInterest(10));
    }
}