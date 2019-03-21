package Experience_3_6;

public class RedState extends AccountState {
    public RedState(Account account) {
        super(account);
    }

    @Override
    void stateCheck() {
        if (this.balance>=-1000&&this.balance<0){
            this.account.setState(new YellowState(account));
        }else if (this.balance>=0){
            this.account.setState(new GreenState(account));
        }
    }

    @Override
    protected void withdraw(float mount) {
        System.out.println("你处于欠费超过1000元的状态不能取钱！");
        System.out.println("您当前的账号余额为：" + balance + "元");
    }
}
