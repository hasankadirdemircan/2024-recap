package recap;

public class Constructor01 {

    public static void main(String[] args) {
        Constructor02 constructor02 = new Constructor02("test");
        Constructor02 constructor03 = new Constructor02("test","test");
        Constructor02 constructor04 = new Constructor02();
        System.out.println("-");
        constructor02.sum(1, 3);
    }
}
