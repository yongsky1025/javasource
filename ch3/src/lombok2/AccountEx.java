package lombok2;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account("홍길동", "110", 120000);

        account.getAccNo();
        account.setAccNo(null);

        // toString 확인
        System.out.println(account);

        Account account2 = new Account();
        account2.setAccNo("200");
        account2.setBalance(20000);
        account2.setName("성춘향");

        // lombok 사용
        Account account3 = Account.builder()
                .accNo("330")
                // .balance(250000) // Builder를 사용하면 순서 상관없이 지정 가능
                .name("이수지")
                .build();

        System.out.println(account3);

    }
}
