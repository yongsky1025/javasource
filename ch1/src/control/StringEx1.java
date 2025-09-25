package control;

// 타입
// 1. 기본형 : byte, short, int, long, float, double, char, boolean
// 2. 참조형 : 기본형을 제외한 모든 타입(앞자리 대문자로 시작)
public class StringEx1 {
    public static void main(String[] args) {
        // 문자열 : ""
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";

        // 문자열이 같은가? ==, !=
        System.out.println(str1 == str2 ? "문자열이 같다" : "문자열이 다르다");

        // new String과 그냥 할당은 메모리의 저장되는 방식이 다르기때문에 ==를 사용하면 메모리 형식이 달라서 false로 처리됨.
        String str3 = new String("안녕하세요");
        System.out.println(str1 == str3 ? "문자열이 같다" : "문자열이 다르다");
        System.out.println();

        // equals 저장방식 상관없이 문자 자체만 비교
        System.out.println("equals 사용");
        System.out.println(str1.equals(str3) ? "문자열이 같다" : "문자열이 다르다");
        System.out.println();

        // abc == ABC
        String str4 = "abc", str5 = "ABC";
        System.out.println("equalsIgnoreCase 사용");
        System.out.println(str4 == str5 ? "abc == ABC" : "abc != ABC");
        System.out.println(str4.equals(str5) ? "abc == ABC" : "abc != ABC");
        // equalsIgnoreCase 대소문자 구분 없이 비교
        System.out.println(str4.equalsIgnoreCase(str5) ? "abc == ABC" : "abc != ABC");
    }

}
