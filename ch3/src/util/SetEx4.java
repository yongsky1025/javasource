package util;

import java.util.HashSet;
import java.util.Set;

public class SetEx4 {
    public static void main(String[] args) {

        // 1 ~ 45 => 6개 숫자를 무작위로 추출
        // List, Set
        Set<Integer> set = new HashSet<>();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);
    }

}