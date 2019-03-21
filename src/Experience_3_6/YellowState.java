package Experience_3_6;

public class YellowState extends AccountState {

    YellowState(Account account) {
        super(account);
    }

    @Override
    void stateCheck() {
        if (balance>=0){
            this.account.setState(new GreenState(account));
        }else if(balance < -1000){
            this.account.setState(new RedState(account));
        }
    }
}
