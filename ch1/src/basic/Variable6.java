package basic;

// println과 printf의 차이
public class Variable6 {
    public static void main(String[] args) {
        int num = 10;
        int sum = num + 20;

        System.out.println("num 변수 값 : " + num);
        System.out.println("num + 20 = " + sum);
        // %d자리에 변수를 출력
        // \n(%n) : 줄바꿈
        System.out.printf("num 변수 값 : %d\n", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age = " + age + ", maxSpeed = " + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        // %10d는 자릿수 10자리
        System.out.printf("age = %10d, maxSpeed = %5d\n", age, maxSpeed);

    }
}
