package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // // while 변형구조
        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의의 수 : 1 ~ 100 사이의 정수
        // 컴퓨터가 생성한 임의의 수 맞추기
        // ex) 컴67 나50 "좀더 큰 수 입력"

        int answer = (int) ((Math.random() * 100) + 1);
        int num = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력 >> ");
            num = Integer.parseInt(sc.nextLine());

            if (num >= 1 && num <= 100) {
                if (num < answer) {
                    System.out.println("좀 더 큰 수를 입력");
                }
                if (num > answer) {
                    System.out.println("좀 더 작은 수를 입력");
                }
            } else {
                System.out.println("\n범위 내의 숫자를 입력해주세요\n");
            }

        } while (answer != num);
        System.out.print("\n정답입니다.\n");
        sc.close();
    }
}
