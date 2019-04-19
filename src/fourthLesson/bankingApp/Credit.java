package fourthLesson.bankingApp;


public class Credit extends BankAccount {

    private String clientName;
    private int balance;
    private int creditAmount;
    int newBalance;

    public Credit(String clientName) {
        this.clientName = clientName;

    }


    public int getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public void showBalance(int balance) {
        getBalance();
        System.out.println(clientName + "'s balance = " + balance);

    }

    @Override
    public void addMoney(int creditAmount) {

        System.out.println(clientName + " wants to add money: " + creditAmount);

        System.out.println(balance + creditAmount);
        newBalance = balance + creditAmount;
        System.out.println(newBalance);

    }

    @Override
    public void withdrowMoney(Balance o) {

        System.out.println(o + " wants to withdrow money " + clientName);
    }

    @Override
    public void calculatePaymentFee() {


    }

    @Override
    public void notifyAllObservers(String aboutAction) {

        System.out.println("Notify " + clientName + " new balance = " + newBalance);
    }


}

