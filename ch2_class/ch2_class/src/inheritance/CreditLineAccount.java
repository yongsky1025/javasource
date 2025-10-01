package inheritance;

public class CreditLineAccount extends Account {

    private long creditLine;

    public CreditLineAccount(String accountNo, String owner, long balance, long creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    @Override
    long withdraw(long amount) throws Exception {
        if ((getBalance() + this.creditLine) < amount) {
            throw new Exception("출금 불가: 한도 초과");
        }
        setBalance(getBalance() - amount);
        return getBalance();
    }
}
