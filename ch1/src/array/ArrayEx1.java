package array;

// 배열(array)
// 같은 타입의 여러 번수를 하나의 묶음으로 다루는 것
// 타입 배열명[] = new 타입[10];  배열 선언과 생성
// 타입[] 배열명 = new 타입[10];  배열 선언과 생성 //대괄호위치 둘 다 가능
// 한번 생성하면 길이를 변경할수 없음.
public class ArrayEx1 {
    public static void main(String[] args) {
        // 시험점수 저장
        // 10명
        // int score1 = 0, score2 = 0, score3 = 0;
        // int sum = score1 + score2 + score3;
        // double avg = (double) sum / 10;

        // 타입 : 기본형(int, long, float, double, boolean, char),
        // 참조형(기본형이 아닌 모든것 ex:String...)

        // int[]arr5; // 배열 선언
        // arr5 = new int[3]; // 배열 생성

        // 배열을 생성 및 선언하면 기본으로 넣어주는 데이터
        // 정수형
        int[] arr1 = new int[10]; // 0
        System.out.println(arr1[3]);
        // 실수형
        double[] arr2 = new double[5]; // 0.0
        System.out.println(arr2[3]);
        // 논리형
        boolean[] arr3 = new boolean[3]; // false
        System.out.println(arr3[0]);
        // 문자형
        char[] arr4 = new char[3]; // arrarr : ''비어있음
        System.out.println("arr" + arr4[0] + "arr");

        // 초기화
        // arr1[0] = 88;
        // arr1[1] = 90;
        // arr1[2] = 87;

        // 배열 선언, 생성, 초기화
        int score[] = { 88, 90, 87, 86, 77, 78, 79, 75, 72, 66 };
        // int sum = score[0] + score[1] + .... + score[9];

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            System.out.println("총합 : " + sum);
        }
        System.out.println("평균 : " + sum / score.length);
    }
}
