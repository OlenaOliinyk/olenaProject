package thirdLesson.employee;

public class Employee {

    private  String name;
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Employee(String name, String surname) {

        this.name = name;
        this.surname = surname;
        this.id = Math.random() * 9 + 1;
    }

    public void print() {

        System.out.println("Employee name: " + getName() + " " + getSurname() + " id: " + getId());
    }

    public Employee() {
        this.id = Math.random() * 9 + 1;
    }
}
