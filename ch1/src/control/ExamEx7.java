package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        //
        // -------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // -------------------------------------
        // 선택 >>
        // 1
        // 입금액 >> 100000
        //

        // -------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // -------------------------------------
        // 선택 >>
        // 2
        // 출금액 >> 20000

        // -------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // -------------------------------------
        // 선택 >>
        // 3
        // 잔고 >> 80000

        // -------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // -------------------------------------
        // 선택 >>
        // 4
        // 프로그램 종료

        Scanner sc = new Scanner(System.in);

        //// 나의 코드
        // int in = 0, out = 0, money = 0;
        // while (true) {
        // System.out.println("-------------------------------------");
        // System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
        // System.out.println("-------------------------------------");
        // System.out.print("선택 >> ");

        // int num = Integer.parseInt(sc.nextLine());

        // if (num == 1) {
        // System.out.print("입금액 >> ");
        // in = Integer.parseInt(sc.nextLine());
        // money += in;
        // }
        // if (num == 2) {
        // System.out.println("잔고 >> " + money);
        // System.out.print("출금액 >> ");
        // out = Integer.parseInt(sc.nextLine());
        // if (out > money) {
        // System.out.println("잔액 부족입니다.");
        // } else {
        // money -= out;
        // }
        // }
        // if (num == 3) {
        // System.out.println("잔고 >> " + money);
        // }
        // if (num == 4) {
        // System.out.print("프로그램 종료");
        // break;
        // }

        boolean run = true;
        int balance = 0; // 잔액

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("입금액 >> ");
                    // 받은 정수를 money에 할당해서 balance에 사칙연산을 하기 위함이므로 할당을 건너뛰고 바로 연산도 가능.
                    // int money = Integer.parseInt(sc.nextLine());
                    // balance += money
                    balance += Integer.parseInt(sc.nextLine());
                    break;

                case 2:
                    System.out.println("출금액 >> ");
                    // int money = Integer.parseInt(sc.nextLine());
                    balance -= Integer.parseInt(sc.nextLine());
                    break;

                case 3:
                    System.out.println("잔액 >> " + balance);
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }
}
