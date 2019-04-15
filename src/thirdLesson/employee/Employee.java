package thirdLesson.employee;

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

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public void setId() {
        this.id = id;
    }

    public Employee(String name, String surname, double id) {

        this.name = name;
        this.surname = surname;
        setId();
    }

    public static void print(String s) {

        System.out.println(s);
    }

    public Employee() {
        this.id = Math.random() * 9 + 1;

    }

}
