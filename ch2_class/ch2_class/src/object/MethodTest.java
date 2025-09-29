package object;

public class MethodTest {
    // 두 개의 인자(==매개변수)를 받아서 덧셈 후 덧셈 결과 리턴
    int sum(int num1, int num2) {
        // int result = num1 + num2;
        // return result;
        return num1 + num2;
    }

    // 두 개의 인자(float 타입)를 받아서 나눗셈 후 나눗셈 결과 리턴
    // double divide(float num1, float num2)
    // double이 float보다 크기때문에 자동 형변환 가능.
    float divide(float num1, float num2) {

        return num1 / num2;
    }

    // 두 개의 인자(소수점 가능)(==매개변수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // 두 개의 인자를 받아서 하나의 문자열로 리턴
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int 타입의 배열을 받아서 배열을 리턴

    // int[] arr = new int[3];
    // int[] arr = { 3, 4, 5 };

    int[] call(int[] arr) {
        return arr;
    }

    // 단순 출력일 경우 인자(매개변수)가 없어도 상관없음
    String print() {
        return "안녕하세요";
    }
}