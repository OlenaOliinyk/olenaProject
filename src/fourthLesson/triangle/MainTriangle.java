package fourthLesson.triangle;


public class MainTriangle {

    public static void main(String[] args) {
        TriangleArea mainTriangle = new TriangleArea();

        try {
            mainTriangle.square();
        } catch (SelfIntersectingExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("================");
        }
    }
}