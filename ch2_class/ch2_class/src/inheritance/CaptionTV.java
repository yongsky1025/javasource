package inheritance;

public class CaptionTV extends TV {

    boolean caption;

    public CaptionTV(boolean power, int size, int channel, String color) {
        super(power, size, channel, color);
        // TODO Auto-generated constructor stub
        // supoer(); //부모쪽의 생성자에 맞춰서 불러와야함.

    }

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

}
