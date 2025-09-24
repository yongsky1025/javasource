package basic;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d; // 손실이 나더라도 강제로 저장(소수점 버려짐)
        System.out.printf("d = %f, score = %d\n", d, score);
    }
}
