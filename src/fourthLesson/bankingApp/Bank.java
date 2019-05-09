package fourthLesson.bankingApp;


public class Bank implements Observer {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void update(String clientName, int balance) {

        System.out.println(bankName +" is notified: "+ clientName + "'s updated balance = "+ balance);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}


