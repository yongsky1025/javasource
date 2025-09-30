package object;

public class DataEx {
    public static void main(String[] args) {
        // Data 인스턴스 생성
        Data data = new Data();
        data.x = 10;
        // change(data.x);
        System.out.println("change 호출 후 " + data.x);
        change(data);
        System.out.println("change(Data d) 호출 후 : " + data.x);
        System.out.println("change(Data d) 호출 후 : " + data.y);

        Data data2 = copy(data);
        System.out.println("data2.x = " + data2.x);
        System.out.println("data2.y = " + data2.y);
    }

    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        tmp.y = 7;
        return tmp;
    }

    // public static void change(int x) {
    // x = 15;
    // System.out.println("변경 후 " + x);
    // }

    public static void change(Data d) {
        d.x = 15;
        System.out.println("변경 후 " + d.x);
    }
}
