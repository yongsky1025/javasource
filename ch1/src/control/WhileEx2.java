package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합 구하기
        // 345 : 3 + 4 + 5 = 12
        // 12345 : 1 + 2 + 3 + 4 + 5 = 15

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 ex)12345 >>");
        int num = Integer.parseInt(sc.nextLine());

        // num 이 0이 아닐때까지 반복

        int sum = 0;

        while (num != 0) {
            // 123
            // 12
            // 1
            sum = sum + num % 10;
            System.out.printf("sum = %3d num = %d\n", sum, num);
            // int 정수로만 저장되어 소수점은 버려짐
            num = num / 10;
        }
        System.out.println("각 자릿 수 합 " + sum);
    }
}
