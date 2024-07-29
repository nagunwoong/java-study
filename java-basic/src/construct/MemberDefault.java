package construct;

public class MemberDefault {

    String name;

    //클래스를 쓰는 곳에서 생성자를 안넣으면 기본 생성자를 만든다
    MemberDefault() {
        System.out.println("기본 생성지");
    }

}
