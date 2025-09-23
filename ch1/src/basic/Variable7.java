package basic;

//float과 double의 차이
public class Variable7 {
    public static void main(String[] args) {
        // 실수형 : float, double(기본타입)
        // float score1 = 50;
        float score1 = 50.15f;
        double score2 = 45.123d;
        System.out.println("score1 = " + score1); // 50.0
        System.out.println("score2 = " + score2); // 45.0
        // %f 기본 소수6자리 .2%f는 2자리까지만
        System.out.printf("score1 = %f, score2 = %f\n", score1, score2);
        // %10.2f : %전체자릿수.소수점자릿수(.도 갯수에포함)
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2);
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2);
    }

}
