package tutorial8;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Employee emp1 = new Employee(1, "Krishma", "Developer");
        Employee emp2 = new Employee(2, "Luniva", "Designer");

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        manager.displayEmployees();
    }
}
