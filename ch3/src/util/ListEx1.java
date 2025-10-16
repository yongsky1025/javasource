package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // String[] str1 = { "" };
        List<String> list1 = new ArrayList<>();
        // 추가 add = append
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");

        System.out.println(list1); // [사과, 귤, 수박, 멜론, 키위, 배, 감]
        System.out.println(list1.get(3)); // 멜론

        System.out.println("리스트 요소 개수 " + list1.size()); // 리스트 요소 개수 7

        // remove : 특정 위치의 요소 값 삭제
        list1.remove(0);
        System.out.println(list1);
        list1.remove("수박");
        System.out.println(list1);

        // set : 특정 위치의 요소 값 변경
        list1.set(0, "포도");
        System.out.println(list1);

        // 중간삽입
        list1.add(2, "딸기");
        System.out.println(list1);

        // 순서대로 하나씩 뽑기
        for (String string : list1) {
            System.out.println(string);
        }

        // 오름차순
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
        // 내림차순
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);

    }
}
