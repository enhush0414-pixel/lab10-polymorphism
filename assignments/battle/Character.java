

public class Character {
    protected String name;
    protected int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int attack(Character target) {
        target.takeDamage(10);
        return 10;
    }

    public void takeDamage(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }

    public int getHp() { return hp; }
    public String getName() { return name; }
}