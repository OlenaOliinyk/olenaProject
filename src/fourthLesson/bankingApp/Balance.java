package fourthLesson.bankingApp;


//The fees should be 1% for debit account
//1% for credit account - positive balance
//5% in case of negative balance
public interface Balance {
    public void updateFee(String fee);
}
