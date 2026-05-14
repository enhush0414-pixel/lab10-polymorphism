

public class Enemy extends Character {
    public Enemy(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int attack(Character target) {
        int damage = 12;
        target.takeDamage(damage);
        return damage;
    }

    @Override
    public void takeDamage(int amount) {
        super.takeDamage(amount); // Character-ийн takeDamage-ийг дуудна
        System.out.println(this.getName() + " roars!");
    }
}