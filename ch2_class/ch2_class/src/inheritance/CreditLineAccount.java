package inheritance;

public class CreditLineAccount extends Account {

    // 마이너스 한도
    private long creditLine;

    public CreditLineAccount(String accountNo, String owner, long balance, long creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    @Override
    long withdraw(long amount) throws Exception {

        // 상속을 했을땐 super.을 붙일 필요는 없지만
        // 부모의 것을 가져다 썼다는걸 명확하게 하고 싶다면 붙임
        if (super.getBalance() + creditLine < amount) {
            throw new Exception("마이너스 한도 확인");
        }

        // 잔액(잔액 + 마이너스한도) - 사용액
        super.setBalance(super.getBalance() - amount);
        return super.getBalance();

        // if ((getBalance() + this.creditLine) < amount) {
        // throw new Exception("출금 불가: 한도 초과");
        // }
        // setBalance(getBalance() - amount);
        // return getBalance();
    }
}
