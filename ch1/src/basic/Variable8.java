package basic;

public class Variable8 {
    public static void main(String[] args) {
        // 논리형 : 참, 거짓
        boolean flag = false;
        // true = 앞(참) false = 뒤(거짓)
        System.out.println(flag ? "참" : "거짓");
        // 문자형 1개만 들어갈수있음 ''
        char ch = 'a', ch2 = '가';
        // char ch3 = 'ab';
        // 문자열 : 2개이상 ""
        // String ch3 = "a";
        System.out.println("ch = " + ch + ", ch2 = " + ch2);
        System.out.printf("ch = %c, ch2 = %c", ch, ch2);
        System.out.printf("ch = %10c, ch2 = %5c", ch, ch2);
        System.out.println("ch = " + (ch + 1)); // 98
        System.out.println("ch2 = " + (ch2 + 1)); // 44033
        // 문자 %c, 숫자 %d
        System.out.printf("ch2 = %c\n", (ch2 + 1)); // 각
        System.out.printf("ch2 = %d\n", (ch2 + 1)); // 44033
    }
}
