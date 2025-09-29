package object;

public class TV {
    // 속성 : 전원여부(ture/false), 크기(52), 채널번호(7), 색상(black)
    boolean power;
    int size;
    int channel;
    String color;

    // 생성자
    public TV() {
    }

    // 기능 : 채널변경, 전원on/off, 볼륨조절
    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }

    // setter
    // 전원 on/off
    public void setPower(boolean power) {
        this.power = power;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

    // getter
    // boolean타입은 is로 시작(다른건get)
    public boolean isPower() {
        return power;
    }

    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public String getColor() {
        return color;
    }

}