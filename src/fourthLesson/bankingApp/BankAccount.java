package fourthLesson.bankingApp;

public abstract class BankAccount {
    public abstract void addMoney(int creditAmount);
    public abstract void withdrowMoney(Balance o);
    public abstract void calculatePaymentFee();
    public abstract void notifyAllObservers(String s);

}
