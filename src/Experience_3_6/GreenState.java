package Experience_3_6;

class GreenState extends AccountState {

    GreenState(Account account) {
        super(account);
    }

    @Override
    void stateCheck() {
        if (balance < 0 && balance >= -1000){
            this.account.setState(new YellowState(account));
        }else if(balance < -1000){
            this.account.setState(new RedState(account));
        }
    }
}
