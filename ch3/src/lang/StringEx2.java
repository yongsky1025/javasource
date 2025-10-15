package lang;

import java.util.Arrays;

// String
// mutable => immutable(변경불가)
// StringBuffer, StringBuilder
public class StringEx2 {
    public static void main(String[] args) {
        // 1. concat() : 다른 문자열 뒤에 덧붙이기
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1 + str2;
        System.out.println(str3);
        // 리턴타입 존재 -1) 출력문 2) 변수
        System.out.println("concat() " + str1.concat(str3));

        // // 2) contains()
        // boolean result = str3.contains(str1);
        // System.out.println(result);
        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 문자열에 str1 문자열이 포함되지 않음");
        }

        // 3) compareTo() : 문자열 사전순서로 비교
        str1 = "aaa";
        str2 = "bbb";
        System.out.println("str1.comapreTo(aaa) = " + str1.compareTo("aaa")); // 0
        System.out.println("str1.comapreTo(str2) = " + str1.compareTo(str2)); // -1
        System.out.println("str1.comapreTo(str1) = " + str2.compareTo(str1)); // 1

        // 4) endWith("문자열") : 지정된 문자열로 끝나는지 검사
        String fileName = "file1.txt";

        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }
        // 5) equals() : 문자열 비교, equalsIgnoreCase() : 대소문자 구별 없이 비교
        System.out.println("aaa".equals("cccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6) indexOf(문자) : 문자열에서 문자의 위치값 리턴
        str1 = "Hello";
        System.out.println(str1.indexOf('e')); // 1
        System.out.println(str1.indexOf('k')); // -1(못찾음)
        System.out.println(str1.indexOf('e', 2)); // -1(찾을 시작위치)
        System.out.println(str1.indexOf("el")); // 1(문자열중 첫자리 위치)

        // 7) lastIndexOf()
        str1 = "java.lang.Object";
        System.out.println(str1.lastIndexOf('.')); // 9
        System.out.println(str1.indexOf('.')); // 4

        // 8) length() : 문자열 길이 반환
        int arr[] = { 3, 4, 5, 6 };
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            // 기본은 속성값이기에 length에 ()를 붙이지 않음
            // 객체일때만 ()
        }

        // 9) replace() : 문자열 변경함(원본은 훼손하지 않음)
        str1 = "Hello";
        System.out.println(str1.replace('H', 'K')); // Kello
        System.out.println(str1); // Hello

        System.out.println("Hellollo".replace("ll", "LL")); // HeLLoLLo
        // regex : 정규식
        System.out.println("Hellollo".replaceAll("ll", "LL")); // HeLLoLLo
        System.out.println("Hellollo".replaceFirst("ll", "LL")); // HeLLollo

        // 10) split()
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        System.out.println(arr2); // [Ljava.lang.String;@77459877
        System.out.println(Arrays.toString(arr2)); // [dog,cat,bear]
        for (String s : arr2) {
            System.out.println(s);
        }

        String[] arr3 = animals.split(",", 2);
        for (String s : arr3) {
            System.out.println(s);
        }

        // 11) startsWith(prefix) : 주어진 문자열 prefix로 시작하는지 검사 <==> endsWith()
        str1 = "java.lang.Object";
        System.out.println("" + str1.startsWith("java"));
        System.out.println("" + str1.startsWith("lang"));
        System.out.println("" + str1.startsWith("lang", 5));

        // 12) substring(beginIndex) : 시작위치부터 문자열 얻어내기
        // 12) substring(beginIndex, endIndex) : 시작위치 ~ 끝위치까지 문자열 얻어내기(endIndex)미포함
        System.out.println(str1.substring(10));
        // Object
        System.out.println(str1.substring(5, 9));
        // lang

        // 13) toLowerCase() / toUpperCase()
        System.out.println("abcdefg".toUpperCase());
        System.out.println("AbcdEfg".toLowerCase());

        // 14) trim() : 양 끝에 존재하는 공백 제거(중간 공백은 안해줌)
        System.out.println("           Hello World".trim());
        System.out.println("           Hello World           ".trim());
        System.out.println("           Hello          World      ".trim());

        // 15) valueOf() : 지정된 값을 문자열로 변환하여 반환
        String str4 = String.valueOf(5);
        int i = 3;
        str4 = i + "";
        str4 = String.valueOf(10.3f);
        System.out.println(str4);

    }
}
