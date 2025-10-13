package inheritance;

// 멤버변수에 final을 붙이면 상수 => 반드시 초기화 필요

public interface Movable {
    // 상수 선언만 가능
    // final이 없어도 상수로 인식
    int pos = 0;

    // abstract 이 없어도 추상 메서드로 인식
    void move(int x, int y);

    // 만약 일반 메서드를 만들고 싶다면. static, default 붙여야함.
    static void print() {
    }

    default void print2() {
    }

}
