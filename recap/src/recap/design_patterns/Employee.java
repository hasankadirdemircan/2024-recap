package recap.design_patterns;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, int age, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    //getter
    //setter
}