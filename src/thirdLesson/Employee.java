package thirdLesson;

public class Employee {

    String name;
    String surname;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname() { this.surname = surname; }


    public Employee() {

        Employee employee = new Employee();
        employee.getName();
        employee.getSurname();

    }

    public static void print(String name, String surname,double id) {
        System.out.println("Employee name: "+name + " "+surname+", id: "+id);
    }

}
