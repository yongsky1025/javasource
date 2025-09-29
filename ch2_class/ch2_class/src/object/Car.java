package object;

public class Car {
    // 속성 : 제조사명(현대), 모델명(아반떼), 색상(red), 최대속도(200)

    String companyName;
    String model;
    String color;
    int maxSpeed;

    // 생성자(클래스명과 동일)
    // 여러 개 작성 가능
    // 리턴 값이 없음

    // default(기본)생성자 : 컴파일러가 자동으로 추가
    // ※단, 클래스에 정의된 생성자가 하나도 없는경우
    Car() {
    }

    public Car(String companyName) {
        this.companyName = companyName;
    }

    public Car(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }

    public Car(String companyName, String model, String color) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
    }

    public Car(String companyName, String model, String color, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // getter setter 동시에 생성
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void forward() {
        System.out.println(this.model + " 전진한다");
    }

    void backward() {
        System.out.println(this.model + " 후진한다");
    }

    void turn() {
        System.out.println(this.model + " 회전한다");
    }

    @Override
    public String toString() {
        return "Car [companyName=" + companyName + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
                + "]";
    }

}