package shop;

public class ShopEx {
    public static void main(String[] args) {

        // TV tv = new TV("삼성TV", 2300000, "4K");
        // CellPhone cellPhone = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // 속성 초기화 1. 생성자 2. setter 메소드
        // tv.name = "";

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV("삼성TV", 2300000, "4K");
        // tvs[1] = new TV("삼성TV", 2300000, "4K");
        // tvs[2] = new TV("삼성TV", 2300000, "4K");

        // CellPhone[] cellPhones = new CellPhone[3];
        // cellPhones[0] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // cellPhones[1] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // cellPhones[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");

        // // Product, 자식객체
        // Product[] products = new Product[5];
        // products[0] = new TV("삼성TV", 2300000, "4K");
        // products[1] = new TV("LG TV", 2000000, "8K");
        // products[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // products[3] = new CellPhone("갤럭시S22", 1000000, "KT");
        // products[4] = new CellPhone("아이폰17", 5000000, "SKT");

        // for (Product product : products) {
        // product.printDetail();

        // }

        // // 사용자 등록(PayType는 enum을 사용)
        // User user = new User("홍길동", PayType.CARD);

        // MyShop myShop = new MyShop(); // 배열

        MyShop2 myShop = new MyShop2(); // list
        // 이름 지정
        myShop.setTitle("MyShop");
        // 사용자 등록
        myShop.genUser();
        // 상품 등록
        myShop.genProduct();
        myShop.start();

    }
}
