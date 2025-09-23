package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;
        // 변수 선언 후 변수 사용(호출) 및 할당
        int sum = num + 20;
        // println()안의 + : 연결
        System.out.println("num 변수 값 : " + num);
        System.out.println("num + 20 = " + sum);

        int age = 25, maxSpeed = 10;
        System.out.println("age = " + age + ", maxSpeed = " + maxSpeed);
    }
}
