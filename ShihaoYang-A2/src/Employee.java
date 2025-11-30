public class Employee extends Person {
    private String role;
    private double salary;

    public Employee() {}

    public Employee(String name, int age, String id, String role, double salary) {
        super(name, age, id);
        this.role = role;
        this.salary = salary;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}