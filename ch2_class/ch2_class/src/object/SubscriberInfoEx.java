package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {

        // 1. 직접 입력
        // private사용하면 불가

        // 2. 생성자
        // SubscriberInfo info1 = new SubscriberInfo("유용천", "ycyc1212", "1q2w3e4r",
        // "010-4167-3083");
        // SubscriberInfo info2 = new SubscriberInfo("이지영", "jyjyjy959", "1234qwer",
        // "010-1234-1234");
        // SubscriberInfo info3 = new SubscriberInfo("김철수", "cjftn5959", "qweqwe123123",
        // "010-3456-3456");

        // 3. 메소드 : set~~~~
        SubscriberInfo info1 = new SubscriberInfo();
        info1.setId("유용천");
        info1.setName("ycyc1212");
        info1.changePassword("1q2w3e4r");
        info1.changePhone("010-4167-3083");

        SubscriberInfo info2 = new SubscriberInfo();
        info2.setId("이지영");
        info2.setName("jyjyjy959");
        info2.changePassword("1234qwer");
        info2.changePhone("010-1234-1234");

        SubscriberInfo info3 = new SubscriberInfo();
        info3.setId("김철수");
        info3.setName("cjftn5959");
        info3.changePassword("qweqwe123123");
        info3.changePhone("010-3456-3456");

        // 가입자 정보 조회
        // 1. 간단조회 : toString() => 개발자 확인용
        // System.out.println(info1.toString());
        System.out.println(info1); // toString() 자동으로 호출되기 때문에 생략가능
        System.out.println(info2);
        System.out.println(info3);
        System.out.println("==============================");

        // 2. 개별조회 : get~~~~()
        System.out.println("아이디 : " + info1.getId());

        // 비밀번호 변경
        info1.changePassword("794613");
        System.out.println(info1.getName() + "님의 비밀번호 : " + info1.getPassword());

        // 전화번호 변경
        info2.changePhone("010-5979-6868");
        System.out.println(info2.getName() + "님의 비밀번호 : " + info2.getPhone());

    }

}
