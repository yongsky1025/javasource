package object;

public class Triangle {
    // 속성 : 밑변(baseLine), 높이(height)
    // 기능 : 삼각형 너비 (getArea())

    double baseLine;
    double height;

    public Triangle() {
    }

    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 삼각형 넓이 계산명령
    double getArea() {
        return baseLine * height / 2;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
