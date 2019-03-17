package firstLesson;

public class MainTestOptimized {

    public static void calculate(double a, double b, double c) {
        int stepen = 2;

        if (a == 0) {
            System.out.println("It is imposible to divide by 0");
        } else {

            double discriminant = (Math.pow(b, stepen) - 4 * a * c);

            if (discriminant < 0) {
                System.out.println("equation has not solution if discriminant < 0");

            } else {
                double x1 = (-b + Math.sqrt((Math.pow(b, stepen)) - 4 * a * c)) / (2 * a);
                double x2 = (-b - Math.sqrt((Math.pow(b, stepen)) - 4 * a * c)) / (2 * a);
                if (discriminant == 0) {
                    System.out.println("equation has 1 solution if discriminant = 0");

                    System.out.println("x1 = x2= " + x1 + " = " + x2);
                } else {
                    System.out.println("discriminant = " + discriminant);
                    System.out.println("x1 = " + x1);
                    System.out.println("X2 = " + x2);
                }
            }
        }
    }

    /* variants of data:
    1: a=2; b=3; c=1
    2: a=1; b=2; c=1 =>x1=x2
    3: a=1; b=2; c=3 => equation has not solution if discriminant < 0
    4: a=0; b=2; c=3 => it is impossible divide by 0
*/


    public static void main(String[] args) {
        calculate(0, 2, 3);

    }

}