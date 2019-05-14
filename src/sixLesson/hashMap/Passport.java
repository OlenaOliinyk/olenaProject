package sixLesson.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Passport {
    public static void main(String[] args) {
        
        Map<String, Citizen> people = new HashMap<>();
        people.put("CH 408954", new Citizen("Tom", "Dock"));
        people.put("VR 645455", new Citizen("Bill", "Duck"));
        people.put("FE 454056", new Citizen("Nick", "Click"));

        for (Map.Entry<String, Citizen> item : people.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName() + " " + item.getValue().getSurname());
        }
    }
}