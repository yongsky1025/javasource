package lang;

// Exception(예외)
//  종류
//  1) 컴파일 예외 : ClassNotFoundException, 실행하지 않아도 확인(빨간줄)
//  2) 런타임 예외 : ArithmeticException, 실행해야 확인가능

//  처리방법
//  1) 예외 처리    
//  2) 예외 던지기  
// Error
public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(4 / 0); // java.lang.ArithmeticException: / by zero

        try {
            // 예외가 발생할 수 있는 코드 작성
            Class.forName("null");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 개발자 확인용(예외발생이 어디서 났는지 추적)
        }
    }
}
