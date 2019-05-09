package fourthLesson.triangle;

import java.util.ArrayList;

public class TriangleArea {

   private ArrayList<Point> points = new ArrayList<>();


    public TriangleArea() {

        points.add(new Point(4, 3));
        points.add(new Point(4, 7));
        points.add(new Point(4, 5));

    }

    public void square()  throws SelfIntersectingExeption{

        System.out.println("amount of points :  " + points.size());

      // print coordinats of figure
        for (Point c : points)
            System.out.println("coordinate : x = " + c.getX() + " У = " + c.getY());

        double ab = (Math.sqrt(Math.pow((points.get(1).getX() - points.get(0).getX()), 2)
                + Math.pow((points.get(1).getY() - points.get(0).getY()), 2)));
        // System.out.println("Сторона АВ равна  " + ab);

        double bc = (Math.sqrt(Math.pow((points.get(2).getX() - points.get(1).getX()), 2)
                + Math.pow((points.get(2).getY() - points.get(1).getY()), 2)));
        // System.out.println("Сторона ВС равна  " + bc);


        double ca = (Math.sqrt(Math.pow((points.get(0).getX() - points.get(2).getX()), 2)
                + Math.pow((points.get(0).getY() - points.get(2).getY()), 2)));
        //System.out.println("Сторона СА равна  " + ca);

        double p = (ab + bc + ca) / 2;
        double s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));

        if (s == 0.0) {
            throw new SelfIntersectingExeption("Exeption : the triangle is self-intersecting");

        }else {
            System.out.println( "triangle area: "+ s );
        }

    }

}


