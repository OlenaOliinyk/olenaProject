package fourthLesson.bankingApp;

//1- debit account – it is impossible to get more money than the account currently has,
//2- credit account – it is possible to get a credit line for this account.

public class FeeType implements Balance {
    private String userName;

    public FeeType(String feeAmaount) {
        this.userName = feeAmaount;
    }
    //This method will be called to updateFee all followers regarding the new showBalance posted by celebrity.
    @Override
    public void updateFee(String fee) {
        System.out.println( "Balance type is changed for "+userName + "  "+ fee + "  5% in case of negative balance.");
    }
    @Override
    public String toString() {
        return userName;
    }
}