package inheritance;

public class Child extends Parent {

    public Child() {
        // super()가 숨겨져있음
        super(15); // 부모의 생성자 호출
    }

    void play() {
        System.out.println("Play!!!");
    }

    // 오버라이딩 : 부모클래스의 것을 자식 클래스에서 수정하는것
    // 원래라면 기존것이 가려지고 수정한 자식 클래스의 정보만 나타나지만
    // super.list();를 사용하면 오버라이딩을 사용해도 부모것을 불러올수 있음.
    @Override
    public void list() {
        System.out.println("자식 클래스");
    }
}
