package fourthLesson.bankingApp;


public class Bank implements Observer {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void update(String clientName) {

        System.out.print(bankName +" is notified: "+ clientName + "'s updated balance = ");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}


