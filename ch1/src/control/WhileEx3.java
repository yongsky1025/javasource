package control;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        // 사용자한테 숫자를 계속 받아들여서 합계 출력
        // 종료 : 0 입력 시

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("합계를 구할 숫자 입력 >> ");
            int num = Integer.parseInt(sc.nextLine());

            if (num != 0) {
                sum = sum + num;
            } else {
                flag = false;
            }
            System.out.printf("합계 : %d\n", sum);

        }
        System.out.println("종료되었습니다.");
    }
}
