package thirdLesson.employee;

public class MainForEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("Natali", "Kot");
        employee.print();


        Employee employee1 = new Employee();
        System.out.println("id from second constructor: " + employee1.getId());

    }
}
