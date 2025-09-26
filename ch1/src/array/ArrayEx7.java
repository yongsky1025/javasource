package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 배열에 값이 들어가는것이 아닌 주소값만 들어가고
        // 해당 주소에 값은 따로 저장됨
        String[] strArr = { "Kim", "Park", "Yi" };
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[0].length());
        // // 서로 다름
        // String str = "java";
        // String str2 = new String("java");

        // char 배열과 String 배열
        // String : char배열 + 기능(메서드)

        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        // 주소값만 저장되므로 이렇게도 할수있음
        strArr2[1] = new String("Park");
        strArr2[2] = "Yi";

        System.out.println(strArr2[0]);
        System.out.println("strArr2[0].charAt(0)" + strArr2[0].charAt(0)); // K

        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }
        // String => char 배열
        char[] chArr = src.toCharArray();

        // char 배열 => String
        char[] chArr2 = { 'A', 'B', 'C', 'D', 'E' };
        System.out.println(chArr);

        String str2 = new String(chArr);
        System.out.println(str2);

    }
}
