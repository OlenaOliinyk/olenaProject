package secondLesson;

// http://xn--80aa0aqw.net/wp-content/uploads/2011/11/kitaiskui-goroskop-cveta-big.png
public class Goroskop {

    static String chineseHoroscope = "";

    public static void defineCollor(int collor) {

        switch (collor) {
            case 0:
                chineseHoroscope = "White  ";
                break;
            case 1:
                chineseHoroscope = "White  ";
                break;
            case 2:
                chineseHoroscope = "Blue ";
                break;
            case 3:
                chineseHoroscope = "Blue ";
                break;
            case 4:
                chineseHoroscope = "Green ";
                break;
            case 5:
                chineseHoroscope = "Green ";
                break;
            case 6:
                chineseHoroscope = "Rad ";
                break;
            case 7:
                chineseHoroscope = "Rad ";
                break;
            case 8:
                chineseHoroscope = "Yellow ";
                break;
            case 9:
                chineseHoroscope = "Yellow ";
                break;

        }
        System.out.print(chineseHoroscope);
    }

    public static void defineAnimal(int animal) {

        switch (animal) {
            case 0:
                chineseHoroscope =  " Monkey ";
                break;
            case 1:
                chineseHoroscope = " Cock ";
                break;
            case 2:
                chineseHoroscope =  " Dog ";
                break;
            case 3:
                chineseHoroscope =  " Pig ";
                break;
            case 4:
                chineseHoroscope = " Rat ";
                break;
            case 5:
                chineseHoroscope = " Bull ";
                break;
            case 6:
                chineseHoroscope =" Tiger ";
                break;
            case 7:
                chineseHoroscope = " Rabbit ";
                break;
            case 8:
                chineseHoroscope = "Dragon ";
                break;
            case 9:
                chineseHoroscope = " Snake ";
                break;
            case 10:
                chineseHoroscope = " Horse ";
                break;
            case 11:
                chineseHoroscope = "Sheep ";
                break;
        }

        System.out.print(chineseHoroscope);
    }

    public static void main(String[] args) {

        int year = 1986;
        int animal = year % 12;
        int collor = year % 10;
        System.out.print(year + " year ");
        defineAnimal(animal);
        defineCollor(collor);


    }


}

