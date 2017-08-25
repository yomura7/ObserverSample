public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Wizard wizard = new Wizard();
        hero.addObserver(wizard);
        for (int i = 0; i < 5; i++) {
            hero.encountMonster();
        }
    }
}
