import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9,10}; //alt + enter < 에러를 잡아줌
        Member member = new Member(1,"yongwon",Grade.VIP);
        System.out.println("지금은 Intellij를 테스트 하는중"); //sout < 단축키
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);

        }
        System.out.println(member);


    }
}
enum Grade{
    VIP,
    BASIC

}

class Member {
    private int id;
    private String name;
    private Grade grade;

    public Member(int id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}