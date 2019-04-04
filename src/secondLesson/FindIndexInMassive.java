package secondLesson;

import java.util.Arrays;

//Task 5:
//find index of elements in massive that is the same with a
public class FindIndexInMassive {

    public static void findIndex(int[] d, int a) {
        int tempResult = 0;

        for (int i = 0; i < d.length; i++)
            if (d[i] == a) {
                System.out.print(i + "th index, ");
                tempResult = tempResult + d[i];
            }
        if (tempResult == 0) {
            System.out.println("Massiv has not " + a);
        }

    }

    public static void main(String[] args) {

        int[] d = {15, 207, 92, 62, 315, 92, 487, 268, 405, 241};
        System.out.println("Massive:");
        Arrays.stream(d).forEach(System.out::println);

        System.out.print("Result: a is ");

        findIndex(d, 207);
    }
}
