package org.example;

import java.util.*;

public class EmployeeService {
    public Set<Employee> getEmployeesByOrder(List<Employee> employees) {
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if (employee1.getAge() == employee2.getAge()) {
                    return employee1.getName().compareTo(employee2.getName());
                }
                return employee1.getAge() < employee2.getAge() ? -1 : 1;
            }
        };
        Set<Employee> employeeSet = new TreeSet<>(comparator);
        employeeSet.addAll(employees);
        return employeeSet;
    }
}