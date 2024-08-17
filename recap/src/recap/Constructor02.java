package recap;

public class Constructor02 {

    Constructor03 constructor03;

    public Constructor02() {
        constructor03 = new Constructor03();
        System.out.println("constructor init.");
    }

    public Constructor02(String name) {
        System.out.println("constructor init.");
        System.out.println(name);
    }

    public Constructor02(String name, String email) {
        System.out.println("constructor init.");
        System.out.println(name);
        System.out.println(email);
    }

    public void sum(int n1, int n2) {
        Constructor03 constructor03 = new Constructor03();
        constructor03.sum(n1, n2);
    }

    public void multipy(int n1, int n2) {
        constructor03.multipy(n1, n2);
    }
}
