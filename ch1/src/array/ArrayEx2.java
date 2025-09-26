package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 'a', 'b', 'c', 'd'를 담고싶음.
        char[] arr1 = { 'a', 'b', 'c', 'd' };
        System.out.println(arr1);

        // 99.8, 86.2, 55.3, 23.755
        double[] arr2 = { 99.8, 86.2, 55.3, 23.7 };
        System.out.println(arr2);

        // "bear", "snow", "sun"
        String[] arr3 = { "bear", "snow", "sun" };
        System.out.println(arr3);

        // 1~10 임의의 수 생성 후 초기화
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d, ", arr4[i]);
        }
        System.out.println();

        // 배열 길이가 명확하지 않는 경우 => 입력값으로 결정
        int[] arr5;

        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이 입력 : ");
        int length = sc.nextInt();
        arr5 = new int[length];
        System.out.println(arr5);

        // 배열 출력
        // Arrays.toString()
        // 배열이 가지고 있는 실제 값 출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        // for 출력
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);

        }
        System.out.println();

        // 향상된 for문
        // 하나씩 전부 다 출력할경우 foreach가 편함
        // for(타입 변수 : 부를변수){}
        for (String str : arr3) {
            System.out.print(str);

        }
        System.out.println();
        for (char ch : arr1) {
            System.out.print(ch);

        }

    }
}
