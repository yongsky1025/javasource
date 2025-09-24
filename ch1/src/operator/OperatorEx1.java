package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 단항연산자 : ++ --
        // ++ : +1, -- : -1
        int i = 5;

        i++; // i = i + 1;
        System.out.println(i); // 6

        i--; // i = i - 1;
        System.out.println(i); // 5

        int j = 10;
        ++j;
        System.out.println(j);

        int k = 5, l = 0;
        l = k++; // l=k; k++;
        System.out.println("l = k++; 실행후 , k = " + k + ", l = " + l); // k = 6, l = 5

        k = 5;
        l = 0;
        l = ++k; // k++ l=k;
        System.out.println("l = ++k; 실행후 , k = " + k + ", l = " + l); // k = 6, l = 6
    }
}
