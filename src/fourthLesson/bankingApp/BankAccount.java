package fourthLesson.bankingApp;

public abstract class BankAccount  {
    public abstract void addMoney(int amount);
    public abstract void withdrowMoney(int amount);
    public abstract void calculatePaymentFee(int fee);

    public abstract void notifyBank(Observer o);


}
