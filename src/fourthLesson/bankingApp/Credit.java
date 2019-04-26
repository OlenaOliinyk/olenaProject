package fourthLesson.bankingApp;

import java.util.ArrayList;

public class Credit extends BankAccount {

    private String clientName;
    private int newBalance;
    private int typeOfFee;

   private ArrayList<Observer> bankNames = new ArrayList<>();

    public Credit(String clientName, String bankName) {
        this.clientName = clientName;
        bankNames.add(new Bank(bankName));

    }

    public int showBalance(int balance) {

        System.out.println(clientName + "'s balance = " + balance);
        newBalance = balance;
        return balance;
    }

    @Override
    public void addMoney(int amount) {
        System.out.println(clientName + " wants to add money: " + amount);
        newBalance = newBalance + amount;
    }

    @Override
    public void withdrowMoney(int amount) {

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
    public void newBalance() {
        for (Observer bankName : bankNames) {
            bankName.update(clientName, newBalance);
        }
    }


}