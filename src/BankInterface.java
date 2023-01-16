public interface BankInterface {
    double checkBalance();
    String AddMoney(int amount);
    String withDraw(int amount,String password);
    double claculateInterest(int years);

}
