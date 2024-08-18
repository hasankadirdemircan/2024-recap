package recap.java8.interface_ex;

@FunctionalInterface
interface LambdaFunctionWithParameter{
    void message(String msg);
}
public class LambdaTest02 {

    public static void main(String[] args) {
        LambdaFunctionWithParameter lambda01 = arg -> System.out.println("Message is : " + arg);

        // eger parametre tiplerini belirmek istiyorsak,
        LambdaFunctionWithParameter lambda02 = (String arg) -> System.out.println("Message is : " + arg);

        // lambda body kullanarak yapmak istiyorsak,
        LambdaFunctionWithParameter lambda03 = (String arg) -> {
            System.out.println("Message is : " + arg);
        };

        lambda01.message("hello lambda expression");
    }
}