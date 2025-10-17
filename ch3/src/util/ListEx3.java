package util;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // Member 객체를 List 에 담기

        List<Member> list1 = new ArrayList<>();
        list1.add(new Member("hong12", "hong12", "홍길동12"));
        list1.add(new Member("hong13", "hong13", "홍길동13"));
        list1.add(new Member("hong14", "hong14", "홍길동14"));
        list1.add(new Member("hong15", "hong15", "홍길동15"));

        // 2번째 Member 조회
        Member member = list1.get(2);
        System.out.println("이름 " + member.getName());

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("아이디\t비밀번호\t이름");
        System.out.println("-------------------------");
        // 전체 Member 조회
        for (Member mem : list1) {
            System.out.printf("%s\t%s\t\t%s\n", mem.getId(), mem.getPassword(), mem.getName());
        }
        System.out.println();

        // fori사용
        for (int i = 0; i < list1.size(); i++) {
            Member mem = list1.get(i);
            System.out.printf("%s\t%s\t\t%s\n", mem.getId(), mem.getPassword(), mem.getName());
        }

    }
}
