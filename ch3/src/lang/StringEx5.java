package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("1234AB12AB345AB", "AB"));
        System.out.println(count("12345BC", "AB"));

    }

    public static int count(String src, String target) {
        // target 이 src 내에 몇번 나오는가?
        // indexOf()
        int count = 0;
        int pos = 0;

        while ((pos = src.indexOf(target, pos)) != -1) {
            pos = pos + target.length();
            count++;
        }
        return count;
        // for (int i = 0; i < src.length(); i++) {
        // i = src.indexOf(target, i);
        // if (i < 0) {
        // break;
        // }
        // count++;
        // }

    }
}
