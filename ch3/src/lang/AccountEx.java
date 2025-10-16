package lang;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("111", "김민수", 10000);

        try {
            account.withdraw(200000);
        } catch (BalaceInsufficientException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
