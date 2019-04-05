package secondLesson;

import java.util.Arrays;

public class MassiveMainTest extends MethodsForMain {

    public static void main(String[] args) {
        System.out.println("Task 6: array:");
        int[] c = {11, 30, 50, 61, 71, 83, 1, 5, 5};
        Arrays.stream(c).forEach(System.out::println);

        MethodsForMain.arithmetic(c);

        MethodsForMain.median(c);

        MethodsForMain.mode(c);

        MethodsForMain.standarDeviation(c);
    }
}