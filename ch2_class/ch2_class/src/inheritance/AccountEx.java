package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");
        // // 입금
        // checkingAccount.deposit(200000);
        // // 입금 후 잔액
        // System.out.println("잔액 : " + checkingAccount.getBalance());

        // // 직불카드 사용
        // try {
        // System.out.println("체크카드 지불 후 잔액 : " + checkingAccount.pay("111-22",
        // 300000));
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // 보너스 포인트
        BonuspointAccount bonuspointAccount = new BonuspointAccount("111", "홍길동", 100000, 0);
        // 입금
        bonuspointAccount.deposit(200000);
        // 입금 후 잔액, 보너스 포인트
        System.out.println("잔액 : " + bonuspointAccount.getBalance());
        System.out.println("보너스 포인트 : " + bonuspointAccount.getBonusPoint());

        // 마이너스 카드
        CreditLineAccount creditLineAccount = new CreditLineAccount("111", "홍길동", 50000, 5000000);
        try {
            System.out.println("체크카드 지불 후 잔액 : " + creditLineAccount.withdraw(7000000));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
