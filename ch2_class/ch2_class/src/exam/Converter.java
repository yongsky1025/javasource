package exam;

import java.util.Scanner;

public abstract class Converter {
    protected double ratio;

    abstract protected double convert(double src); // 추상 메소드

    abstract protected String getSrcString(); // 추상 메소드

    abstract protected String getDestString(); // 추상 메소드

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다");
        scanner.close();
    }
}
