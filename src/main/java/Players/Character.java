package Players;

import Players.behaviours.iAttack;
import Players.behaviours.iDefend;
import Rooms.Treasure;

import java.util.ArrayList;

public abstract class Character implements iAttack, iDefend {

    private String name;
    private int life;
    private int strength;
    private int defense;
    private ArrayList<Treasure> bag;

    public Character(String name, int life, int strength, int defense) {
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.defense = defense;
        this.bag = new ArrayList<>();
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

    public ArrayList<Treasure> getBag(){ return this.bag; }

    public void addTreasure(Treasure item) { this.bag.add(item); }

    // ################# //
    // #### methods #### //
    // ################# //

    public int attack(iDefend enemy){

        // get the attack
        int attack = this.getAttackValue();
        // get the defence
        int defense = enemy.getDefense();

        // calculate damage
        int damage = attack - (defense / 2);

        // reduce life
        enemy.receiveDamage(damage);
        return damage;
    }

    public int getAttackValue(){
        return this.getStrength();
    }

    public void receiveDamage(int amount_of_damage){
        this.life -= amount_of_damage;
    }

    public void reduceLife(int amount_to_reduce){
        this.life -= amount_to_reduce;
    }
}
