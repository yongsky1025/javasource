package ycycycycyc;

import java.util.Scanner;

public class MyMathEx {
    public static void main(String[] args) {

        // 메소드 호출
        // 1) 변수에 받기
        // 2) 출력문

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("두번째 숫자 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.print("연산자 : ");
        String mark = sc.nextLine();

        long result = 0;
        double result2 = 0;

        MyMath myMath = new MyMath();

        if (mark.equals("+")) {

            result = myMath.add(num1, num2);
            System.out.println("덧셈결과 : " + result);

        } else if (mark.equals("-")) {
            result = myMath.subtract(num1, num2);
            System.out.println("뺄셈결과 : " + result);

        } else if (mark.equals("*")) {
            result = myMath.multiply(num1, num2);
            System.out.println("곱셈결과 : " + result);

        } else if (mark.equals("/")) {
            result2 = myMath.divide(num1, num2);
            System.out.println("나눗셈결과 : " + result);
        }

    }
}
