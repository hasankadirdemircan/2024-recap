package recap.java8.interface_ex;

@FunctionalInterface
interface Car {
    public boolean equals(Object o);
    void run();
    public String toString();
}