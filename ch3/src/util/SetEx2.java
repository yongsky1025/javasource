package util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import java.util.Collections;
import java.util.Comparator;

public class SetEx2 {

    public static void main(String[] args) {
        // 1 ~ 45 => 6개 숫자를 무작위로 추출
        // List, Set
        Set<Integer> set = new HashSet<>();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);

        // Collection<? extends Integer> c

        // set => list 변환
        List<Integer> list = new LinkedList<>(set);
        // 정렬
        Collections.sort(list);
        System.out.println(list);

        // list => set 변환
        Set<Integer> list2 = new HashSet<>(set);
        System.out.println(list2);


    }
}
