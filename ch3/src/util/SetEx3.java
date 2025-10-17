package util;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("hong12", "hong12", "홍길동12"));
        set.add(new Member("hong13", "hong13", "홍길동13"));
        set.add(new Member("hong14", "hong14", "홍길동14"));
        set.add(new Member("hong12", "hong12", "홍길동12"));

        for (Member member : set) {
            System.out.println(member);
        }
    }
}
