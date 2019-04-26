package fourthLesson.bankingApp;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Credit client1 = new Credit("Sara", "aval");
        Credit client2 = new Credit("Ranbir", "private");

        client1.showBalance(1000);
        client1.addMoney(20);
        client1.newBalance();
        client1.withdrowMoney(45);
        client1.newBalance();
        client1.addMoney(77);
        client1.newBalance();
        client1.calculatePaymentFee(client1.findFee());
        System.out.println("----------");
        client2.showBalance(-200);
        client2.addMoney(5);
        client2.newBalance();
        client2.withdrowMoney(25);
        client2.newBalance();
        client2.calculatePaymentFee(client2.findFee());
    }
}

