package Experience_3_5;

import java.util.ArrayList;
import java.util.List;

public abstract class Observerable {

    protected List<Observer> observers = new ArrayList<>();

    abstract void registerObserver(Observer observer);
    abstract void removeObserver(Observer observer);
    abstract void notifyObserver();
}
