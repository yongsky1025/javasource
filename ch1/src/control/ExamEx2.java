package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 작은 값 구하기

        Scanner sc = new Scanner(System.in);

        System.out.print("비교할 첫번째 숫자 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("비교할 두번째 숫자 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.print("비교할 세번째 숫자 : ");
        int num3 = Integer.parseInt(sc.nextLine());

        // 내가 짠 코드
        if (num1 < num2 || num1 < num3) {
            System.out.println("가장 작은 수 : " + num1);

        } else if (num2 < num1 || num2 < num3) {
            System.out.println("가장 작은 수 : " + num2);

        } else if (num3 < num1 || num3 < num2) {
            System.out.println("가장 작은 수 : " + num3);
        }

        // // 강사님 코드

        // int min = num1;

        // if (min > num2) {
        // min = num2;
        // }
        // if (min > num3) {
        // min = num3;
        // }
        // if (min > num1) {
        // min = num1;
        // }
        // System.out.println("가장 작은 수 : " + min);
        // 세 개의 정수를 입력받아 가장 큰 값 구하기

        // int max = num1;

        // if (max < num2) {
        // max = num2;
        // } else if (max < num3) {
        // max = num3;
        // }
        // System.out.print("가장 큰 수 " + max);

    }
}
