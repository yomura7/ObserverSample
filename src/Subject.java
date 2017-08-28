import java.util.ArrayList;

abstract public class Subject {

    private ArrayList<Observer> observerList = new ArrayList<Observer>(0);

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
