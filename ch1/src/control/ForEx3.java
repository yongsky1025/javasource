package control;

public class ForEx3 {
    public static void main(String[] args) {

        char star = '*';

        // **********
        // **********
        // **********
        // **********
        // **********
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 10; j++) {
        // System.out.print(star);
        // }
        // System.out.println();
        // }

        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        // 구구단 2~9단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d\n", i, j, i * j);
            }
        }
    }
}
