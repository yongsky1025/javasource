package object;

public class GoodsStock {
    // 속성 : 상품명(p00001), 수량(10)

    String name;
    int amount;

    // 기본생성자
    // (만들지 않아도 보이지는 않지만 컴파일러가 자동으로 만들어줌)
    public GoodsStock() {
    }

    public GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    // setter, getter 메소드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }

}
