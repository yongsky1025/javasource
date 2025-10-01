package inheritance;

public class Child2 extends Parent {
    // 생성자를 입력하지 않아도 아래의 생성자를 컴파일러가 안보이게 만들어줌
    // public Child2(){
    // super(); // 부모의 생성자 호출
    // }

    @Override
    public void list() {
        // TODO Auto-generated method stub
        super.list();
    }
}
