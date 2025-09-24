package basic;

import java.util.Scanner;
// System.in : 키보드
// System.out : 모니터(화면)

public class ScannerEx4 {
    public static void main(String[] args) {
        // ScannerEx3 개선
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자입력 : ");

        // 입력받기 : sc.nextLine() ==> ""
        // "" 을 없애야 한다면 Integer.parseInt, Float.parseFloat, Double.parseDouble

        // String num1 = sc.nextLine();
        // int input1 = Integer.parseInt(num1);
        int input1 = Integer.parseInt(sc.nextLine()); // num1을 할당하지 않을거라면 바로 넣어도 무관.
        // float input1 = Float.parseFloat(sc.nextLine()); 실수(소수점)로 저장방법
        // double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : "); // +, -, *, /
        String op = sc.nextLine();

        System.out.print("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());

        // 출력부
        System.out.println(op);
        System.out.println(input1 + input2);

        // 프로그램 종료
        sc.close();

    }
}
