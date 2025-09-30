package object;

public class CarEx {
    public static void main(String[] args) {

        // Car 인스턴스 생성 : 생성자 호출됨
        Car car = new Car();

        // 현대자동차 아반떼, 흰색, 200
        // 멤버 변수 초기화

        // 1. 직접접근(X) 사용하지 않음
        // car.companyName = "현대";
        // car.model = "아반떼";
        // car.model = "white";
        // car.maxSpeed = 200;

        // 2. setter 메소드 : 초기화, 변경
        car.setCompanyName("현대");
        car.setModel("아반때");
        car.setColor("white");
        car.setMaxSpeed(200);
        System.out.println(car);

        // 3. 생성자
        Car car2 = new Car("기아");
        System.out.println(car2);

        Car car3 = new Car("현대", "소나타");
        System.out.println(car3);

        Car car4 = new Car("현대", "아이오닉5", "gray");
        System.out.println(car4);

        Car car5 = new Car("현대", "포터", "white", 150);
        System.out.println(car5);

        // setter 메소드를 사용하여 변경 (null -> "green")
        car3.setColor("green");
        System.out.println("색상 지정 후 car3 : " + car3);

        // println(car);
        println(car2);
        // println(car3);
        // println(car4);
        // println(car5);

        // car2 println 호출 후 색상 값 변경
        System.out.println(car2);

    }

    // Car 클래스
    public static void println(Car car) {
        // 원본의 값이 변경됨
        car.setColor("빨강");

        System.out.println("---------------------");
        System.out.println("제조회사 : " + car.getCompanyName());
        System.out.println("모델명 : " + car.getModel());
        System.out.println("색상 : " + car.getColor());
        System.out.println("최고속도 : " + car.getMaxSpeed());
        System.out.println("---------------------");
    }

    // 설명하려고 잠깐 쓴것
    public static void test(String str) {

    }
}
