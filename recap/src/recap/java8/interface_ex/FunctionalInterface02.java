package recap.java8.interface_ex;


public class FunctionalInterface02 {

    public static void main(String[] args) {
        LambdaFunction lambdaFunction = () -> System.out.println("Lambda Function");

        lambdaFunction.message();


        X x = new X();
        x.message();
    }
}
