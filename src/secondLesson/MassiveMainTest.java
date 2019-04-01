package secondLesson;

public class MassiveMainTest extends MethodsForMain {

    public static void main(String[] args) {
        System.out.println("Task 6:");

        int[] c = {11, 30, 50, 61, 71, 83, 1, 5, 5};

        MethodsForMain.arithmetic(c);

        MethodsForMain.median(c);

        MethodsForMain.mode(c);

        MethodsForMain.standarDeviation(c);
    }
}