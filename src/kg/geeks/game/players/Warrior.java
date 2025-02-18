package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coef = RPG_Game.random.nextInt(4) + 2; // 2,3,4,5
        boss.setHealth(boss.getHealth(heroes) - this.getDamage() * coef);
        System.out.println("Warrior " + this.getName() + " hits critically "
                + this.getDamage() * coef + " damages to boss.");
    }
}
