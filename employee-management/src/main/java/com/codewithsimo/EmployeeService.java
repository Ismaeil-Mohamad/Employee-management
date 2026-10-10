package com.codewithsimo;

import java.util.*;

public class EmployeeService {
private final List<Employee>employees= new ArrayList<>();
private final Map<Integer,Employee> employeesById =new HashMap<>();

public void addEmployee(Employee employee){
    if(employee == null){
        throw  new IllegalArgumentException("Employee cannot be null.");

    } if(employeesById.containsKey(employee.getId())){
        throw new IllegalArgumentException("Employee ID already exists.");
    }
    employees.add(employee);
    employeesById.put(employee.getId(),employee);
}

public Optional<Employee>findEmployeeById(int id){
    return Optional.ofNullable(employeesById.get(id));
}
public List <Employee>getAllEmployees(){
    return List.copyOf(employees);
}
public int getEmployeeCount(){
    return employees.size();
}
}
