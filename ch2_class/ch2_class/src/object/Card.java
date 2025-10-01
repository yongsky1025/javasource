package object;

// 변수

// 1. 인스턴스(속성, 멤버, 필드) 변수 : 클래스 영역 => 인스턴스 생성 후
// 2. 클래스 변수 : 클래스 영역(static : "공유"의 의미) => 클래스가 메모리에 올라갈때(저장 ctrl + s)
// 3. 지역 변수 : 메서드 영역, 생성자, 매개변수, 생성자 내부
public class Card {

    // private String kind; // 인스턴스 변수
    // static String cv; // 클래스 변수

    // 지역변수 : 내부에서만 사용
    // void print(int i) {
    // int j = 0;
    // }

    String kind;
    int number;
    static int width = 100;
    static int height = 150;

    @Override
    public String toString() {
        return "Card [kind=" + kind + ", number=" + number + "]";
    }

}
