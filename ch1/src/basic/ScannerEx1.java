package basic;

import java.util.Scanner;
// System.in : 키보드
// System.out : 모니터(화면)

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        int input = sc.nextInt();
        System.out.printf("입력값 %d", input);
        sc.close();
    }
}
