package Players;

public abstract class Character {

    private String name;
    private int life;
    private int strength;
    private int defense;

    public Character(String name, int life, int strength, int defense) {
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
