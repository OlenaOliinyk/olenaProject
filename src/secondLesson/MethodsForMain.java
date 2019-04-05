package secondLesson;

import java.util.stream.IntStream;

public class MethodsForMain  {


    public static void arithmetic(int[] c) {
        System.out.println("6. 1 - calculate arithmetic mean of massive");
        float sum = 0;
        for (int i : c) {
            sum = IntStream.of(c).sum();
        }
        System.out.println(sum / c.length);
    }


    public static void median(int[] c) {

        System.out.println("6. 2 - calculate median of massive");
        BubleSorting.massive(c);
        System.out.println(" ");

        if (c.length % 2 != 0) {
            int median = c.length / 2;
            System.out.println("Result: median of odd massive = " + c[median]);
        } else {

            int firstValue = c.length / 2;
            int secondValue = firstValue - 1;
        /*    System.out.println(firstValue);
            System.out.println(secondValue);
            System.out.println(c[firstValue]);
            System.out.println(c[secondValue]);*/
            System.out.print("Result: median of even integer massive: ");
            System.out.println((c[secondValue] + c[firstValue]) / 2);
        }
    }


    public static void mode(int[] c) {
        System.out.println("6. 3 - calculate mode");
        int maxValue = c[0];
        int maxCount = 0;
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == c[i])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = c[i];
            }
        }
        System.out.println("Result: mode of massive = " + maxValue);

    }

    public static void standarDeviation(int[] c) {
        System.out.println("6.4 - calculate  standard deviation");
        int sum = 0;
        int max = 0;
        int min = c[0];
        double sd = 0;
        for (int i :c) {
            sum +=i;
        }
        double average = sum / c.length;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
        }
        //System.out.println("max number is : " + max);
        for (int i = 0; i < c.length; i++) {
            if (c[i] < min) {
                min = c[i];
            }
        }
        // System.out.println("min number is : " + min);
        for (int i = 0; i < c.length; i++) {

            sd = sd + Math.pow(c[i] - average, 2);
        }
        double standardDeviation = Math.sqrt(sd / (c.length - 1));

        System.out.println("Result : deviation =  " + standardDeviation);
    }
}

