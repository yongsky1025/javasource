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
        // e.printStackTrace();
        // }

        // // 보너스 포인트
        // BonuspointAccount bonuspointAccount = new BonuspointAccount("111", "홍길동",
        // 100000, 0);
        // // 입금
        // bonuspointAccount.deposit(200000);
        // // 입금 후 잔액, 보너스 포인트
        // System.out.println("잔액 : " + bonuspointAccount.getBalance());
        // System.out.println("보너스 포인트 : " + bonuspointAccount.getBonusPoint());
        // bonuspointAccount.deposit(300000);
        // System.out.println("잔액 : " + bonuspointAccount.getBalance());
        // System.out.println("보너스 포인트 : " + bonuspointAccount.getBonusPoint());

        // 마이너스 카드
        // try {
        // CreditLineAccount creditLineAccount = new CreditLineAccount("111", "홍길동",
        // 100000, 5000000);
        // System.out.println("체크카드 지불 후 잔액 : " + creditLineAccount.withdraw(3000000));
        // System.out.println("체크카드 지불 후 잔액 : " + creditLineAccount.withdraw(2000000));
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // 교통카드\
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("111", "홍길동", 100000, "222", false);
        CheckingTrafficCardAccount cardAccount2 = new CheckingTrafficCardAccount("444", "김미나", 100000, "444", true);

        // 예금
        cardAccount.deposit(10000);
        try {
            // 출금
            System.out.println("출금 후 잔액 " + cardAccount.withdraw(50000));
            // 교통카드 사용 후 잔액
            System.out.println("교통비 지급 후 잔액 " + cardAccount2.payTrafficCard("444", 2100));
            // 교통카드 기능없는데 교통카드 사용액 지불
            System.out.println("교통비 지급 후 잔액 " + cardAccount.payTrafficCard("222", 2100));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
