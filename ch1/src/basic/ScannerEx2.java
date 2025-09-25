package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // println() : 출력후 엔터 처리
        // print() : 출력(엔터 없음)
        // printf() : 포맷지정(엔터 없음)
        System.out.print("두자리 정수 입력 : ");
        String num = sc.nextLine(); // ex) 35 = > "35"
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1)); // ex) "35" + 1 => "351"

        // "35" => 35
        int input = Integer.parseInt(num); // String => int
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1)); // 35 + 1 => 36
    }
}
