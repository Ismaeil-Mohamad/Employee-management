package com.codewithsimo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        EmployeeService service = new EmployeeService();

        Employee emp1 = new Employee(101, "Simo", 2999.0);
        Employee emp2 = new Employee(102, "Maryam", 3499.0);
        Employee emp3 = new Employee(103, "Ahmed", 4200.0);
        Employee emp4 = new Employee(104, "Sara", 3750.0);
        Employee emp5 = new Employee(105, "Omar", 5100.0);
        Employee emp6 = new Employee(106, "Lina", 2800.0);
        Employee emp7 = new Employee(107, "Karim", 4600.0);
        Employee emp8 = new Employee(108, "Nour", 3200.0);
        Employee emp9 = new Employee(109, "Youssef", 5500.0);
        Employee emp10 = new Employee(110, "Maya", 3900.0);
        service.addEmployee(emp1);
        service.addEmployee(emp2);
        service.addEmployee(emp3);
        service.addEmployee(emp4);
        service.addEmployee(emp5);
        service.addEmployee(emp6);

        System.out.println("All employees:");
        for(Employee employee: service.getAllEmployees()){
            System.out.println(employee);
        }
        System.out.println("\nSearch employee with ID 102:");
        service.findEmployeeById(101)
                .ifPresentOrElse(
                        System.out::println,()-> System.out.println("Employee not found.")
                );

        System.out.println("\nTotal employees: " + service.getEmployeeCount());


    }
}
