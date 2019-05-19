package sixLesson.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Passport, Citizen> people1 = new HashMap<>();
        people1.put(new Passport("CH444444"), new Citizen("Tic", "Tok"));
        people1.put(new Passport("CH55555"), new Citizen("Lil", "Lol"));
        people1.put(new Passport("CH66666"), new Citizen("Pin", "Ball"));
        for (Map.Entry<Passport, Citizen> item1 : people1.entrySet()) {

            System.out.println( item1.getValue().getName() + " " + item1.getValue().getSurname());
          System.out.println(" his passport CH444444 - "+item1.getKey().getPass().equals("CH444444"));



        }

    }
}