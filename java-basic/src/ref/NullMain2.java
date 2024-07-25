package ref;

public class NullMain2 {

    public static void main(String[] args) {
        // nullPointException 에러 발생
        Data data = null;
        data.value = 10;
        System.out.println("data = " + data);
    }

}
