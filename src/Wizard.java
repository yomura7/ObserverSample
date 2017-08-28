public class Wizard implements Observer {
    @Override
    public void update(Subject subject) {
        Hero hero = (Hero)subject;
        if (hero.getHp() < 40) {
            hero.setHp(hero.getHp() + 60);
            System.out.println("魔法使いは回復魔法を使った！勇者の体力が 60 回復した！");
        }
    }
}
