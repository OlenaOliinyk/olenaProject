package secondLesson;

public class Loops {
    public static void main(String[] args) {

        long from;
        long to;
        String primeNumbers = "";

        for (from = 1; from <= 50000; from++) {
            int counter = 0;

            for (to = from; to >= 1; to--) {
                if (from % to == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {

                primeNumbers = primeNumbers + from + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 50000 are :");
        System.out.println(primeNumbers);

    }
}