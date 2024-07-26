package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.name = "나건웅";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "김민준";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name +" , " + "나이는 : " + member.age + " , " + " 점수는 : " + member.grade);
        }

    }
}
