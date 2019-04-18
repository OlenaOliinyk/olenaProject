package fourthLesson.shape;

public abstract class Shape {

    public int rectangleArea(int length, int breadth) {
        int result = length * breadth / 2;
        System.out.println("Rectabgle Area = " + result);
        return result;
    }

    public int squareArea(int side) {
        int result = side * side;
        System.out.println("Square Area = " + result);
        return result;
    }

    public double circleArea(int radius) {

        double result = Math.PI * radius * radius;
        System.out.println("Circle Area = " + result);
        return result;
    }
}
