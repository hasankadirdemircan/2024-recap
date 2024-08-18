package recap.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Function04 {
    public static void main(String[] args) {
        Function<Employee, String> employeeToStringName = e -> e.getName();
        Employee emp1 = new Employee("hkdemircan", 25);
        Employee emp2 = new Employee("x", 25);
        Employee emp3 = new Employee("y", 25);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        List<String> nameList = employees.stream().map(Employee::getName).toList();
        System.out.println(nameList);
    //    System.out.println(employeeToStringName.apply(emp));


    }
}
class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}