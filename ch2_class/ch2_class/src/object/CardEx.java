package object;

public class CardEx {
    public static void main(String[] args) {

        // static을 사용하지 않을 경우
        // CardEx obj = new CardEx();

        // kind 인스턴스 변수 사용
        // 인스턴스 생성 후 사용가능
        Card card1 = new Card();
        card1.kind = "spade";
        card1.number = 2;
        // System.out.printf("card1 %d, %s, %d, %d\n", card1.number, card1.kind,
        // Card.width, Card.height);
        // System.out.println("번호 : " + card1.number);
        // System.out.println("종류 : " + card1.kind);

        info(card1);
        // static을 사용하지 않을 경우
        // obj.info(card1);

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;
        // System.out.printf("card2 %d, %s, %d, %d\n", card2.number, card2.kind,
        // Card.width, Card.height);

        // System.out.println("번호 : " + card2.number);
        // System.out.println("종류 : " + card2.kind);

        info(card2);
        // static을 사용하지 않을 경우
        // obj.info(card2);

        // 클래스 변수(static붙은거) : 클래스이름.클래스변수
        // Card.cv = "";

        // static으로 고정값을 한번에 변경 가능
        Card.width = 80;
        Card.width = 60;

    }

    // void info(Card card)
    static void info(Card card) {
        System.out.println("====================");
        System.out.println("번호 : " + card.number);
        System.out.println("종류 : " + card.kind);
        System.out.println("가로 : " + Card.width);
        System.out.println("세로 : " + Card.height);

    }
}
