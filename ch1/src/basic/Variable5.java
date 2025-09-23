package basic;

//타입명 중복 불가 및 상수
public class Variable5 {
    public static void main(String[] args) {
        int num = 10;
        int sum = num + 20;

        System.out.println("num 변수 값 : " + num);
        System.out.println("num + 20 = " + sum);
        System.out.printf("num 변수 값 : %d", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age = " + age + ", maxSpeed = " + maxSpeed);

        // 타입명을 붙이는건 처음 선언할때만 중복선언 불가
        // int num = 35; //에러
        // 타입명을 제외하면 값이 대체됨 가능
        num = 35;

        // 상수 = 변하지 않는 고정값
        // 상수 선언과 할당(대문자)
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30;
    }
}
