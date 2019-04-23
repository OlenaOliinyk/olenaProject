package fourthLesson.bankingApp;


public class Bank implements Observer {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void update(String clientName) {
        System.out.println(bankName+clientName+"'s updates balance");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                '}';
    }
}


