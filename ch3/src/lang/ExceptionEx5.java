package lang;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
            // 멀티 catch
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("입력값을 입력하거나 입력값 확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 재실행");
        }
    }
}
