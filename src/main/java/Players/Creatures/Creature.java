package Players.Creatures;

import Players.Character;
import WeaponInventory.Weapon;

import java.util.ArrayList;

public abstract class Creature extends Character {

     private String petName;
     private String warCry;
     private Weapon weapon;

    public Creature(String name, String petName, String warCry, Weapon weapon){
         super(name, 12, 8, 16);
         this.petName = petName;
         this.warCry = warCry;
         this.weapon = weapon;
     }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getWarCry() {
        return warCry;
    }

    public void setWarCry(String warCry) {
        this.warCry = warCry;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}


