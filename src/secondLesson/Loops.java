package secondLesson;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        System.out.println("print entire integer from 0 to 50000");
        long from = 0;
        long to = 50000;
        System.out.println("Result:");
        do {
            from = from + 1;

            System.out.print(from + ",");

        } while (from < to);

        System.out.println();
        System.out.println("Task 5:");
        System.out.println("find index of elements in massive that is the same with a");
        int[] d = {15, 207, 92, 62, 315, 92, 487, 268, 405, 241};
        int a = 62;
        int tempResult = 0;
        System.out.println("Result:");
        for (int i = 0; i < d.length; i++) {
            if (d[i] == a) {
                System.out.println(i + "th index");
                tempResult = tempResult + d[i];

            }
        }
        if (tempResult == 0) {
            System.out.println("Massiv has not "+a);
        }

        }
    }
