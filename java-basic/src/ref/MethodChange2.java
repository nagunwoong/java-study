package ref;

public class MethodChange2 {


    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출전 : " + dataA.value);

        change(dataA);
        System.out.println("메소드 호출후 : " + dataA.value);
    }

    static void change(Data dataX) {
        dataX.value = 20;
    }
}
