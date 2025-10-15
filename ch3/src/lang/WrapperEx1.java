package lang;

// 래퍼 클래스
// 기본타입 변수를 객체로 다루고자 할 때 사용
public class WrapperEx1 {
    public static void main(String[] args) {
        // boolean => Boolean
        boolean b = true;
        // Boolean boolean1 = new Boolean(b);
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false; // Boolean.valueOf(false);
        // byte => Byte
        Byte byte1 = 1; // Byte.valueOf((byte)) 1) 자동변환
        // 1 => int 형으로 인식
        Byte byte2 = Byte.valueOf((byte) 1);
        // char => Character
        Character ch = 'a';
        // short => Short
        // int => Integer
        Integer.parseInt("15");
        // long => Long
        Long long1 = 15L;
        Long.parseLong("15.5"); // long
        // float => Float
        Float float1 = 16.5f;
        Float.parseFloat("16.58");
        // double => Double
        Double double1 = 18.5d;
        Double.parseDouble("172.56");

    }

}
