package Players.Physical;

import Players.Character;
import WeaponInventory.Weapon;

import java.util.ArrayList;

public abstract class Physical extends Character {
    private ArrayList<Weapon> inventoryWeapons;
    private ArrayList<Weapon> allowedWeapons;

    private Weapon currentWeapon;

    public Physical(String name, int life, int strength, int defense, ArrayList<Weapon> inventoryWeapons, ArrayList<Weapon> allowedWeapons) {
        super(name, life, strength, defense);
        this.currentWeapon = Weapon.CLUB;
        this.inventoryWeapons = new ArrayList<Weapon>();
        this.allowedWeapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getInventoryWeapons() {
        return inventoryWeapons;
    }

    public void setInventoryWeapons(ArrayList<Weapon> inventoryWeapons) {
        this.inventoryWeapons = inventoryWeapons;
    }

    public ArrayList<Weapon> getAllowedWeapons() {
        return allowedWeapons;
    }

    public void setAllowedWeapons(ArrayList<Weapon> input_allowedWeapons) {

            ArrayList<Weapon> returnList = new ArrayList<>();
             for (Weapon weapon : input_allowedWeapons) {
                 if (weapon.getType().equals("handWeapon") || weapon.getType().equals("rangeWeapon")) {
                     returnList.add(weapon);
                 }
                 }
             allowedWeapons = returnList;

             }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
    public void addWeapon(Weapon to_add) { this.inventoryWeapons.add(to_add); }
    @Override
    public int getAttackValue(){
        return this.getStrength() + this.getCurrentWeapon().getDamage();
    }

}


