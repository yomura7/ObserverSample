public class Wizard implements Observer {
    @Override
    public void update(Hero hero) {
        if (hero.getHp() < 40) {
            hero.setHp(hero.getHp() + 60);
            System.out.println("回復魔法を使った！勇者の体力が 60 回復した！");
        }
    }
}
