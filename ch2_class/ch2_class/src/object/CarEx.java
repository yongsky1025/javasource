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

    }
}
