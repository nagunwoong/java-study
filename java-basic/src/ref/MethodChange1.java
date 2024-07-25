package ref;

public class MethodChange1 {


    public static void main(String[] args) {

        int a = 10;
        System.out.println("메서드 실행전 : " + a);
        change(a);
        System.out.println("메서드 실행후 : " + a);
    }

    static void change(int x) {
        x = 20;
    }

    }
