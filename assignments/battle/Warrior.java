

public class Warrior extends Character {
    public Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int damage = 20;
        target.takeDamage(damage);
        return damage;
    }

    public String describe() {
        return "wields a sword";
    }
}