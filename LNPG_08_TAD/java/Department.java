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

    public String getEmployeesInfo() {
        StringBuilder builder = new StringBuilder();
        this.employees.forEach((employee) -> {
            builder.append(employee.toString());
        });
        return builder.toString();
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
}
