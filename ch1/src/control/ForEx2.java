package control;

public class ForEx2 {
    public static void main(String[] args) {
        // 1 ~ 10 숫자 중에서 짝수 출력
        // for (int i = 1; i < 11; i++) {
        // System.out.print(i + " ");
        // }

        // 짝수만 출력2
        // for (int i = 2; i < 11; i += 2) {
        // System.out.print(i + " ");
        // }

        // // 홀수만 출력
        // for (int i = 1; i < 11; i += 2) {
        // System.out.print(i + " ");
        // }

        // 구구단 출력
        // 3단

        for (int i = 1; i < 10; i++) {
            System.out.printf("3 * %d = %2d\n", i, (3 * i));
        }
    }
}
