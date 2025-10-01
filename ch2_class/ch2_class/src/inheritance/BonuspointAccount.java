package inheritance;

public class BonuspointAccount extends Account {
    // 보너스포인트 적립
    private long bonusPoint;

    public BonuspointAccount(String accountNo, String owner, long balance, long bonusPoint) {
        super(accountNo, owner, balance);
        this.bonusPoint = bonusPoint;
        // TODO Auto-generated constructor stub
    }

    // 예금 + 보너스포인트 적립

    @Override
    void deposit(long amount) {
        super.deposit(amount);
        this.bonusPoint = amount / 100;
        super.deposit(this.bonusPoint);
    }

    public long getBonusPoint() {
        return bonusPoint;
    }

}
