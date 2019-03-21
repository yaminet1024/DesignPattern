package Experience_3_6;

public class Account {
    private AccountState state;
    private String owner;

    public String getOwner() {
        return owner;
    }

    Account(String owner, float init) {
        this.owner = owner;
        this.state = new GreenState(this);
        AccountState.balance = init;
        System.out.println("账户创建成功，当前的余额为" + init);
    }

    void setState(AccountState state){
        this.state = state;
    }

    public void deposit(float amount){
        state.deposit(amount);
    }

    void withdraw(float amount){
        state.withdraw(amount);
    }
}
