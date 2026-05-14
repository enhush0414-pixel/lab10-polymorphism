

public class StrategicCharacter extends Character {
    private AttackStrategy strategy;

    public StrategicCharacter(String name, int hp) {
        super(name, hp);
    }

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int attack(Character target) {
        int damage = (strategy != null) ? strategy.calculateDamage() : 10;
        target.takeDamage(damage);
        return damage;
    }
}