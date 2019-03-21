package Experience_3_5;

public class Shares extends Observerable {

    private int money = 100;


    public void setMoney(int money) {
        if (money>=this.money*1.05||money<=this.money*0.95){
            this.money = money;
            notifyObserver();
        }
        this.money = money;
    }

    @Override
    void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    void removeObserver(Observer observer) {
        if (!observers.isEmpty()){
            observers.remove(observer);
        }
    }

    @Override
    void notifyObserver() {
        for (Observer observer:observers){
            observer.receive(money);
        }
    }
}
