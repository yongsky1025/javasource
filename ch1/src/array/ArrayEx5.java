package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0 ~ 9의 숫자로 초기화
        // int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        // int x = 10, y = 5;
        // // x => y, y=> x
        // int temp = x;
        // x = y;
        // y = temp;
        int temp = 0;
        for (int i = 0; i < 100; i++) {
            // 0~9 사이의 임의의 수 추출
            // 0번과 1~9사이의 임의의 수와 교환
            int random = (int) (Math.random() * 10);
            temp = arr[0];
            arr[0] = arr[random];
            arr[random] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
