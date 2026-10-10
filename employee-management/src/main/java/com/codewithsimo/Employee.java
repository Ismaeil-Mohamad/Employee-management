package com.codewithsimo;

public class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        if(id< 0){
            throw new IllegalArgumentException("Employee ID must be positive.");
        }if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Employee name cannot be empty.");
        }if(!Double.isFinite(salary)|| salary<0){
            throw  new IllegalArgumentException("Salary must be valid and non-negative.");
        }

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
