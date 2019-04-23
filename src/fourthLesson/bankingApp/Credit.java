package fourthLesson.bankingApp;

import java.util.ArrayList;

public class Credit extends BankAccount {

    private String clientName;
    private int balance;
    private int amount;
    private int newBalance;
    private int typeOfFee;
    private ArrayList<Observer> bankNames;

    public Credit(String clientName) {
        this.clientName = clientName;
        bankNames = new ArrayList<Observer>();

    }

    public int getAmount() {
        return amount;
    }


    public int getBalance() {
        return balance;
    }


    public int showBalance(int balance) {
        getBalance();
        System.out.println(clientName + "'s balance = " + balance);
        newBalance = balance;
        return balance;

    }

    public void newBalance() {
        System.out.println(clientName + "'s current balance " + newBalance);
    }

    @Override
    public void addMoney(int amount) {
        getAmount();
        System.out.println(clientName + " wants to add money: " + amount);
        newBalance = newBalance + amount;

    }

    @Override
    public void withdrowMoney(int amount) {
        getAmount();
        if (newBalance > 0) {
            System.out.println(clientName + " wants to withdrow money " + amount);
            newBalance = newBalance - amount;
        } else if (newBalance <= 0) {
            System.out.println(clientName + "'s balance is negative. Impossible to withdrow ");
        }
    }

    @Override
    public void calculatePaymentFee(int fee) {

        System.out.println(clientName + "'s fee amount " + newBalance * typeOfFee / 100);

    }

    public int findFee() {

        if (newBalance < 0) {
            typeOfFee = 5;
            System.out.println(" type of fee " + typeOfFee + "%");


        } else if (newBalance > 0) {
            typeOfFee = 1;
            System.out.println("type of fee " + typeOfFee + "%");
        }

        return typeOfFee;
    }

    @Override
    public void notifyBank(Observer o) {
        System.out.println(o + " is notified of  " + clientName + "'s newBalance " + newBalance);
        for (Observer bankName : bankNames) {
            bankName.update(clientName);
        }

    }

}