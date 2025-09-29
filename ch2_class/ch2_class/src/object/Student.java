package object;

public class Student {
    // 맴버변수, 맴버메소드, 생성자

    // 맴버변수
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)
    String name;
    String tel;
    String address;

    // 생성자(constructor)
    // 클래스명과 같음.
    public Student() {
    }

    // 메서드

    // get
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // 이름 변경 메소드 생성
    // 리턴타입 메소드명(매개변수1, 매개변수2, ......){}
    // void + 기본타입 - int, float, double..., 참조타입 - String, []
    String changeName(String name) {
        this.name = name;

        return this.name;
    }

    // toString으로 모니터링용
    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }
}
