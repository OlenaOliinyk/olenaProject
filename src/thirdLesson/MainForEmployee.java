package thirdLesson;

public class MainForEmployee {
    public static void main(String[] args) {

        Random random = new Random();
        Employee.print("Oksana", "Kot", random.setRandomId());

        Employee employee = new Employee(9.5);
        employee.getId();
    }
}
