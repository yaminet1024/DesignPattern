package Experience_3_6;

public abstract class AccountState {
     static float balance;
     Account account;


     AccountState(Account account) {
        this.account = account;
    }

    void deposit(float mount){
         System.out.println(account.getOwner() + "向当前账户存入" + mount + "元");
         balance = balance + mount;
         System.out.println("您当前的账号余额为：" + balance + "元");
         stateCheck();
    }

    protected void withdraw(float mount){
        System.out.println(account.getOwner() + "向当前账户取出" + mount + "元");
        balance = balance - mount;
        System.out.println("您当前的账号余额为：" + balance + "元");
        stateCheck();
    }

    abstract void stateCheck();


}
