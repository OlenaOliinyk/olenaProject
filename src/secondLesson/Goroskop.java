package secondLesson;

public class Goroskop {
    public static void main(String[] args) {
        // http://xn--80aa0aqw.net/wp-content/uploads/2011/11/kitaiskui-goroskop-cveta-big.png

        int year = 1976;
        int animal = year % 12;
        int collor  = year % 10;
        System.out.print(year+" year - " );

        switch (collor) {
            case 0:
                System.out.print("White  ");
                break;
            case 1:
                System.out.print("White ");
                break;
            case 2:
                System.out.print("Blue ");
                break;
            case 3:
                System.out.print("Blue ");
                break;

            case 4:
                System.out.print("Green ");
                break;
            case 5:
                System.out.print("Green ");
                break;
            case 6:
                System.out.print("Red ");
                break;
            case 7:
                System.out.print("Rad ");
                break;
            case 8:
                System.out.print("Yellow ");
                break;
            case 9:
                System.out.print("Yellow ");
                break;

        }

        switch (animal) {
            case 0:
                System.out.print("Monkey ");
                break;
            case 1:
                System.out.print("Cock");
                break;
            case 2:
                System.out.print("Dog");
                break;
            case 3:
                System.out.print("Pig");
                break;
            case 4:
                System.out.print("Rat");
                break;
            case 5:
                System.out.print("Bull");
                break;
            case 6:
                System.out.print("Tiger");
                break;
            case 7:
                System.out.print("Rabbit");
                break;
            case 8:
                System.out.print("Dragon");
                break;
            case 9:
                System.out.print("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;


        }
    }
}
