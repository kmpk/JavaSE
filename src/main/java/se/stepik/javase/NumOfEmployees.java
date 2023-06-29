package se.stepik.javase;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class NumOfEmployees {
    public static void main(String[] args) {

    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream().filter(dep -> dep.getCode()
                .startsWith("111-"))
                .flatMap(dep -> dep.getEmployees().stream())
                .filter(emp -> emp.getSalary() >= threshold)
                .count();
    }

    UnaryOperator<List<String>> getDistinct(){
        return (s)->(s.stream().distinct().collect(Collectors.toList()));
    }
}

class Employee {
    private String name;
    private long salary;

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
}

class Department {
    private List<Employee> employees;
    private String name;
    private String code;

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
