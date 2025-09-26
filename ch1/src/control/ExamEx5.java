package control;

import java.util.Scanner;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고
        // 눈의 합이 5면 주사위 실행 멈추기

        Scanner sc = new Scanner(System.in);

        int dice1 = 0, dice2 = 0;

        // 강사님 코드
        // while (true) {
        // dice1 = (int) ((Math.random() * 6) + 1);
        // dice2 = (int) ((Math.random() * 6) + 1);
        // System.out.printf("dice1 %d + dice2 %d = %d \n", dice1, dice2, (dice1 +
        // dice2));

        // if (dice1 + dice2 == 5)
        // break;
        // }
        // System.out.printf("dice1 %d + dice2 %d = %d : ", dice1, dice2, (dice1 +
        // dice2));
        // System.out.println("축하합니다.");

        // 내가 짠 코드
        do {
            System.out.print("주사위를 굴려주세요 (0 입력) : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num == 0) {
                dice1 = (int) ((Math.random() * 6) + 1);
                dice2 = (int) ((Math.random() * 6) + 1);
                System.out.printf("dice1 %d + dice2 %d = %d \n", dice1, dice2, (dice1 + dice2));
            }
        } while (dice1 + dice2 != 5);
        System.out.println("축하합니다");
        System.out.println("프로그램 종료");
    }
}
