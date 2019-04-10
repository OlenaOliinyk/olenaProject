package thirdLesson;

public class Accounting {

    public Accounting() {
    }

    public static void pay(double numberWorkHours, double hoursPeyment) {

        double calculatedPayment = numberWorkHours * hoursPeyment;

        System.out.println("A payment for the day is "+calculatedPayment+ " dollars");
    }


}