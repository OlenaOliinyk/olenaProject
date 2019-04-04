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
    public static void arraySortedDesc(int[] c) {
        System.out.println("Sorted  descending massive:");
        for (int i = 0; i < c.length; i++) {

            int maxValue = c[i];
            int maxIndex = i;
            for (int j = i + 1; j < c.length; j++) {

                if (c[j] > maxValue) {
                    maxValue = c[j];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                int tmp = c[i];
                c[i] = c[maxIndex];
                c[maxIndex] = tmp;
            }
            System.out.print(c[i] + " ,");
        }
    }
    public static void main(String[] args) {
        int[] c = {11, 30, 50,100, 61, 71, 83, 1, -5, 5};
        massive(c);
        System.out.println();
        arraySortedDesc(c);
    }

}