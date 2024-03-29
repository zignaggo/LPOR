package LNPG_08_TAD.java;

public class Employee {
    private String name;
    private int id;
    private String role;
    private int salary;
    private Department departament;

    public Employee(String name, int id, String role, int salary, Department departament) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getRole() {
        return role;
    }
    public int getSalary() {
        return salary;
    }
    public Department getDepartament() {
        return departament;
    }

    public void updatePersonalData(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void transferDepartament(Department department) {
        this.departament = department;
    }

    public String getDepartamentInfo() {
        return this.departament.getInfo();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [name=");
        builder.append(name);
        builder.append(", id=");
        builder.append(id);
        builder.append(", role=");
        builder.append(role);
        builder.append(", salary=");
        builder.append(salary);
        builder.append(", departament=");
        builder.append(departament);
        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Alvacy", 1, null, 0, null);
        System.out.println(employee.toString());
    }
}
