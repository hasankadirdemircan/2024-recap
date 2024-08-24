package recap.method;

public class Method01 {

    public static void main(String[] args) {

        Method01 method01 = new Method01();
        int variable1 = 20;
        int variable2 = 40;
        int variable3 = 50;
        int variable4 = 60;

        int result1 = method01.sum(20, 40);
        int result2 = substract(50, 60);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        method01.saveUsernamePassword("a", "b");

        Method2 method2 = new Method2();
        System.out.println(method2.multipy(3, 5));
        Method2.divide(10, 2);
    }

    public int sum(int n1, int n2) {
        return n1 + n2;

    }

    public static int substract(int n1, int n2) {
        return n1 - n2;
    }

    public void saveUsernamePassword(String username, String password) {
       // repository.save(username.concat(password));
        System.out.println(username.concat(password));
    }
}
