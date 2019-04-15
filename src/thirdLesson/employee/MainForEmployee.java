package thirdLesson.employee;

public class MainForEmployee {
    public static void main(String[] args) {

        Random random = new Random();

       Employee employee = new Employee("Natali", "Kot", random.generateRandomValue());
       Employee.print("Employee name: " + employee.getSurname() + " " + employee.getName() + " id: " + random.generateRandomValue());

        Employee employee1 = new Employee();
        System.out.println("id from second constructor: "+employee1.getId());

    }
}
