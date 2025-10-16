package lang;

public class ExceptionEx4 {
    public static void main(String[] args) {
        try {
            // exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // // try_catch 2개 따로 써도 작동은 동일.(코드가 길어짐)
        // try {
        // String data2 = args[0];

        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("인자 확인");
        // }
        // try {
        // String data1 = "a100";
        // } catch (NumberFormatException e) {
        // System.out.println("입력값 확인");
        // }
    }
}
