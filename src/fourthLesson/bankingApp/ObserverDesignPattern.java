package fourthLesson.bankingApp;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Credit client1 = new Credit("Sara Kit");
       // Credit client2 = new Credit("Ranbir Kapoor");
        FeeType onePecent = new FeeType("Jay");
        FeeType fivePercent = new FeeType("Rajan");
      //  FeeType raj = new FeeType("Raj");
      //  FeeType vijay =  new FeeType("Vijay");
      //  FeeType amit = new FeeType("Amit");
       // FeeType harsh =  new FeeType("Harsh");
      //  client1.addMoney(5);
        client1.withdrowMoney(onePecent);
        client1.calculatePaymentFee();
        //client2.addMoney(5555);
        //client2.withdrowMoney(onePecent);
       // client2.calculatePaymentFee();
        //client2.showBalance(50);
        //client1.withdrowMoney(fivePercent);
        // client1.showBalance("T");
        System.out.println("----------");
        client1.showBalance(100000);
        client1.addMoney(20);


    }
}

