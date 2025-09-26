package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[][] score = new int[3][4]; // 3행 4열

        // 직접할당당
        score[0][0] = 78;
        score[1][1] = 68;

        // System.out.println(score.length);
        // System.out.println(score[0].length);

        // // for (int i = 0; i < score.length; i++) {
        // // for (int j = 0; j < score[i].length; j++) {
        // // System.out.print(score[i][j] + "\t"); // \t(tab)

        // // }
        // // System.out.println();
        // // }
        // // System.out.println();

        // 한번에 할당
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // 가변 배열
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2]; // 00
        arr2[1] = new int[3]; // 000
        arr2[2] = new int[2];// 00

        //
        int[][] jumsu = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 70 },
        };

        int kor = 0, eng = 0, math = 0;
        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("================================================");
        for (int i = 0; i < jumsu.length; i++) {
            // 개인별 총점, 평균 변수
            int sum = 0;
            float avg = 0.0f;
            kor += jumsu[i][0];
            eng += jumsu[i][1];
            math += jumsu[i][2];

            System.out.printf("%3d\t", i + 1);
            for (int j = 0; j < jumsu[i].length; j++) {
                sum += jumsu[i][j];
                System.out.printf("%3d\t", jumsu[i][j]);

            }
            avg = sum / (float) jumsu[i].length;
            System.out.printf("%3d\t%5.1f", sum, avg);
            System.out.println();
        }
        System.out.println("================================================");
        System.out.printf("총점 :\t%3d\t%3d\t%3d", kor, eng, math);

        // 과목별 총점 코드
        // System.out.print("총점 : ");
        // for (int i = 0; i < jumsu[i].length; i++) {
        // int total = 0;
        // for (int j = 0; j < jumsu.length; j++) {
        // total += jumsu[j][i];
        // }
        // System.out.printf("\t%3d", total);

        // }

    }

}
