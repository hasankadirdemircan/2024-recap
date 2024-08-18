package recap.java8.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Function03 {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("H");
        user1.setSalary(11000);

        User user2 = new User();
        user2.setName("M");
        user2.setSalary(2000);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Function<User, User> f1 = user -> {
            user.setSalary(user.getSalary() * 2);
            return user;
        };

        userList.stream().filter(u -> u.getSalary() < 10000).map(user -> {
            user.setSalary(user.getSalary() * 2);
            return user;
        }).forEach(System.out::println);

    }

}

class User {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}