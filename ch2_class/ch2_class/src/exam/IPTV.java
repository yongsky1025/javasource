package exam;

public class IPTV extends ColorTV {

    private String ip;

    public IPTV(int size, int color, String ip) {
        super(size, color);
        this.ip = ip;
    }

    @Override
    void printProperty() {
        System.out.printf("나의 IPTV는 주소의 %S ", this.ip);
        super.printProperty();

    };
}
