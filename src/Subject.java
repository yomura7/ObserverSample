import java.util.ArrayList;

abstract public class Subject {

    protected int hp;
    private ArrayList<Observer> observerList = new ArrayList<Observer>(0);

    public Subject(int hp) {
        this.hp = hp;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
