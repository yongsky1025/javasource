package control;

public class ForEx1 {
    public static void main(String[] args) {
        // 반복문 : for, while, do~while

        // int i = 0; 초기화
        // i < args.length; 조건식
        // i++; 증감식
        for (int i = 0; i < args.length; i++) {
            // 조건식이 참인 동안 반복적으로 수행할 문장
        }

        // // 1씩 증가 0~9 10번
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i + " 안녕하세요");
        // }

        // // 2씩 증가 0~9 5번
        // for (int i = 0; i < 10; i += 2) {
        // System.out.println(i + " 안녕하세요");
        // }

        // // 1씩 감소 10~1 10번
        // for (int i = 10; i > 0; i--) {
        // System.out.println(i + " 안녕하세요");
        // }

        // // 복수 변수 선언 가능
        // for (int i = 0, j = 1; i > 0; i--, j++) {

        // }

        // // 1 ~ 10 까지 출력
        // for (int i = 1; i < 11; i++) {
        // System.out.print(i + " ");
        // }

        // 1~10 합계 구하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            // sum = sum + i;
            sum += i;
            System.out.println("1 ~ 10까지 합 " + sum);
        }
    }
}
