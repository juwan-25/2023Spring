package Strong_Weak1;

import java.util.Date;

public class Strong_Weak_Di {
    public static void main(String[] args) {
        Date date = new Date(); // 강한 결합
        System.out.println("date1:"+date);
    }

    public static void getDate(Date d) {
        Date d2 =d; // 약한 결합
        System.out.println("date2:"+d2);
    }
    public static void MemberUse1(){
        Member m1 = new Member(); // 강한 결합
    }
    public static void MemberUse2(Member m){
        Member m2 = m; // 약한 결합
    }
}
class Member{
    String name;
    String nickName;
    public Member(){};
}