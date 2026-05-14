

public class Mage extends Character {
    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int damage = 15;
        target.takeDamage(damage);
        return damage;
    }

    public String describe() {
        return "channels magic";
    }
}