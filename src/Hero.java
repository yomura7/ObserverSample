import java.util.ArrayList;
import java.util.Random;

public class Hero {

    private int hp;
    private ArrayList<Observer> observerList = new ArrayList<Observer>(0);

    public Hero() {
        hp = 100;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    public void encountMonster() {
        int damage = new Random().nextInt(50);
        hp -= damage;
        System.out.println("魔物が現れた！");
        System.out.println("魔物の攻撃！勇者は " + damage + " のダメージを受けた！");

        // Observerへの通知
        notifyObserver();

        if (hp <= 0) {
            hp = 0;
            System.out.println("勇者は力尽きた。\n");
        } else {
            System.out.println("現在の体力は " + hp + " だ！\n");
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

