package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간 까지는 시간당 10030
        // 8시간 이후에는 원래 받던 금액의 1.5배
        // 오늘 근무시간을 입력 받은 후 하루 일당 산출
        // 일당은 정수형

        Scanner sc = new Scanner(System.in);
        System.out.print("금일 노동 시간 : ");

        int hours = Integer.parseInt(sc.nextLine());

        // //내가 짠 코드
        // int pay = 10030;

        // if (hours <= 8) {
        // System.out.printf("금일 임금 : %d원", (hours * pay));
        // } else if (hours > 8) {
        // System.out.printf("금일 임금 : %d원", ((8 * pay) + (int) ((hours - 8) * pay *
        // 1.5)));
        // }

        // 강사님 코드
        int rate = 10030, pay = 0;
        if (hours > 8) {
            pay = rate * 8 + (int) ((hours - 8) * rate * 1.5);

        } else {
            pay = rate * hours;
        }
        System.out.printf("근무시간 %d시간, 임금 : %d원", hours, pay);
    }

}
