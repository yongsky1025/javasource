package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // 비교 연산자 : > < >= <= == !=
        // true, false 결과값
        // == : 같다
        // != : 같지 않다

        int a = 10;
        float f = 10.0f;

        // 다른 타입과의 연산은 더 큰쪽의 타입으로 맞춰서 비교 및 연산
        System.out.println(a == f); // true
        System.out.println(a != f); // false
        System.out.printf("'A' == 65 %b\n", 'A' == 65);
    }
}
