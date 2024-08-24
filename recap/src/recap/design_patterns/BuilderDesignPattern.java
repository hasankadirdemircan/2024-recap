package recap.design_patterns;

public class BuilderDesignPattern {

    public static void main(String[] args) {
        Employee employee1 = new Employee("firstname", "lastname", 20, "x", 5);
        Employee employee2 = new Employee("firstname", "lastname");

        Person person = new Person();
        person.setAge(24);
        person.setFirstName("firstname");
        person.setLastName("lastname");


        User user = new User.UserBuilder("firstname", "position")
                .setAge(5)
                .setSalary(1)
                .build();
    }
}
