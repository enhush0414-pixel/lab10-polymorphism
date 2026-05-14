
public class Rogue extends Character {
    public Rogue(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int damage = 25;
        target.takeDamage(damage);
        return damage;
    }

    public String describe() {
        return "sneaks in shadow";
    }
}