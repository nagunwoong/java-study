package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        MemberInit member2 = new MemberInit();

        initMember(member1, "나건웅", 18, 80);
        initMember(member2, "김민준", 20, 90);




        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름 : " + member.name +" , " + "나이는 : " + member.age + " , " + " 점수는 : " + member.grade);
        }

    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }

}
