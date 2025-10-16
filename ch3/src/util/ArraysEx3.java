package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx3 {
    public static void main(String[] args) {
        int[] arr = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        Integer[] arr2 = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };

        // 정렬 - 선택정렬, 버블정렬, 퀵정렬...
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후");
        System.out.println(Arrays.toString(arr));

        // 내림차순 정렬
        // Arrays.sort(T[] a, Comparator<? super T> c);
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후");
        System.out.println(Arrays.toString(arr2));

        // 문자열 오름차순
        String[] arr3 = { "good", "height", "dog", "lion", "cat", "zero", "zoo" };
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr3));

    }

}
