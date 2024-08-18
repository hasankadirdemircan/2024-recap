package recap.java8.interface_ex;


interface MyInterface1{
    public default void defaultMethod(){
        System.out.println("MyInterface1 defaultMethod");
    }

    public abstract void test();
}

interface MyInterface2{
    public default void defaultMethod(){
        System.out.println("MyInterface2 defaultMethod");
    }

    public abstract void test();
}

class DiamondProblemTest implements MyInterface1, MyInterface2{


    @Override
    public void defaultMethod() {

    }

    @Override
    public void test() {

    }
}
