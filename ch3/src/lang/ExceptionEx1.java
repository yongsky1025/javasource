package lang;

// Throwable
// Exception(예외)
//  종류
//  1) 컴파일 예외 : ClassNotFoundException, 실행하지 않아도 확인(빨간줄)
//  2) 런타임 예외 : ArithmeticException, 실행해야 확인가능

//  처리방법
//  1) 예외 처리
//   - try ~ catch
//      catch 작성 시
//      - 하나로 모든 exception 처리
//          try{}catch(Exception e){}
//      - 개별로 exception 처리
//          ① 다중 chtch
//          ② 멀티 catch
//   - try ~ catch ~ finally
//      finally{ exception 발생여부와 상관없이 꼭 실행해야할 코드 작성}
//   - try ~ finally
//
//  2) 예외 던지기  
//      메소드() throws 예외명, 예외명

// 강제 Exception 발생시키기
// - 사용자 정의 예외
//  throw new XXXException()
// Error
public class ExceptionEx1 {
    public static void main(String[] args) {
        // System.out.println(4 / 0); // java.lang.ArithmeticException: / by zero

        // try {
        // // 예외가 발생할 수 있는 코드 작성
        // Class.forName("null");
        // } catch (ClassNotFoundException e) {
        // e.printStackTrace(); // 개발자 확인용(예외발생이 어디서 났는지 추적)
        // }

        // 예외가 발생할 수 있는 코드 작성
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("null");
    }
}
