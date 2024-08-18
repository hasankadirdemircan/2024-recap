package recap.java8.interface_ex;


@FunctionalInterface
interface LambdaFunctionWithMoreParameters{
    void plus(int number1, int number2);
}
public class LambdaTest03 {

    public static void main(String[] args) {

        LambdaFunctionWithMoreParameters lambda01 = (number1, number2) ->System.out.println("Plus is : " + (number1 + number2));
        // 1 den fazla parametre varsa paranteze almak zorundayiz.

        // parametre tipini beliretek yazacak olursak,
        LambdaFunctionWithMoreParameters lambda02 = (int number1, int number2) ->System.out.println("Plus is : " + (number1 + number2));
        // eger parametrelerden birinin tipini belirtirsek digerlerini de belirtmek zorundayiz.

        // lambda body ile yazacak olursak,
        LambdaFunctionWithMoreParameters lambda03 = (int number1, int number2) ->{
            System.out.println("Plus is : " + (number1 + number2));
        };

        lambda02.plus(3, 5);

    }
}