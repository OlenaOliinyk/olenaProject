package secondLesson;

public class BubleSorting {
    public static void massive(int[] c) {
        System.out.println("Sorted massive:");
        for (int i = 0; i < c.length; i++) {

            int minValue = c[i];
            int minIndex = i;
            for (int j = i + 1; j < c.length; j++) {

                if (c[j] < minValue) {
                    minValue = c[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = c[i];
                c[i] = c[minIndex];
                c[minIndex] = tmp;
            }
            System.out.print(c[i] + " ,");
        }
    }

}