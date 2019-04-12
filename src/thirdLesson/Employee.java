package thirdLesson;

public class Employee {

    private String name;
    private String surname;
    private double id;

    public String getName() {
        return name;
    }

    public double getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }


    public Employee() {

        Employee employee = new Employee();
        employee.getName();
        employee.getSurname();

    }

    public static void print(String name, String surname, double id) {
        System.out.println("Employee name: " + name + " " + surname + ", id: " + id);
    }

    public Employee(double Id) {
        Random randomId = new Random();
        // randomId.setRandomId();
        System.out.println(randomId.setRandomId() + " - id from second constructor ");

    }
}
