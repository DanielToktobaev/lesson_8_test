package kg.geeks.game.players;

public class Spitfire extends Hero {
    public Spitfire(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SPITFIRE_CRIT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth(heroes) - this.getDamage());
        if (getHealth(heroes) <= 0) {
            setHealth(boss.getDamage() - 80);
            System.out.println("Spitfire used his superability");
        }

    }
}