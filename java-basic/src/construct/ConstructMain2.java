package construct;

public class ConstructMain2 {

    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("나건웅", 18, 90);
        MemberConstruct member2 = new MemberConstruct("김민준", 19, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름은 : " + s.name+ " 나이는 : " + s.age +" 평균은 : " + s.grade);
        }
    }
}
