package fourthLesson.shape;

public class Area extends Shape {
    @Override
    public void rectangleArea(int length, int breadth) {
        int result = length * breadth / 2;
        System.out.println("Rectabgle TestArea = " + result);
    }

    @Override
    public void squareArea(int side) {
        int result = side * side;
        System.out.println("Square TestArea = " + result);
    }

    @Override
    public void circleArea(int radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Circle TestArea = " + result);
    }
}
