package LNPG_08_TAD.java;

import java.util.ArrayList;

public class Department {
    private String name;
    private int id;
    private String location;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Department [name=");
        builder.append(name);
        builder.append(", id=");
        builder.append(id);
        builder.append(", location=");
        builder.append(location);
        builder.append("]");
        return builder.toString();
    }
    @Override
    public String toString() {
        return this.getInfo();
    }

    public static void main(String[] args) {
        Department departament1 = new Department("Departament 1", 12, "Casa do caralho");
        Employee employee1 = new Employee("Jorge", 1, "Estagiário", 1412, departament1);
        departament1.addEmployee(employee1);
        System.out.println(departament1.toString());
        System.out.println(departament1.getEmployees());
    }
}
