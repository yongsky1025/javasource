package lang;

public class StringEx4 {
    public static void main(String[] args) {
        String[] names = { "Quean", "Tod", "Kim", "Park", "Hong" };
        StringEx4 obj = new StringEx4();

        String result = obj.findKim(names);
        System.out.println(result);
    }

    public String findKim(String[] names) {
        int pos = 0;
        // return 값 : Kim 은 ? 번째에 있다
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                pos = i;
                // i 값 보관
                // 중지
                break;
            }
        }
        return "Kim 은 " + (pos + 1) + "번째에 있다";
    }
}
