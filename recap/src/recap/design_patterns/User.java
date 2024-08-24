package recap.design_patterns;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.position = userBuilder.position;
        this.salary = userBuilder.salary;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }


    public double getSalary() {
        return salary;
    }


    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String position;
        private double salary;

        /**
         * @param firstName -> Required Field
         * @param position  -> Required Field
         */
        public UserBuilder(String firstName, String position) {
            this.firstName = firstName;
            this.position = position;
        }

        /**
         * @param lastName -> Optional Field
         */
        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * @param age -> Optional Field
         */
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * @param salary -> Optional Field
         */
        public UserBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}