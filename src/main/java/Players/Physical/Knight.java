package Players.Physical;

import Players.Character;
import WeaponInventory.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class Knight extends Physical {

    private ArrayList<Weapon> allowedWeapons;
    private String motto;


    public Knight(String name) {
        super(name, 12, 8, 16, new ArrayList<Weapon>(), new ArrayList<Weapon>());
        this.setAllowedWeapons(new ArrayList<Weapon>(Arrays.asList(Weapon.CLUB, Weapon.DAGGER, Weapon.SWORD)));
        this.setCurrentWeapon(Weapon.SWORD);
        this.motto = "Gallant is my middle name.";
    }


    @Override
    public void attack() {

    }

    @Override
    public void receiveDamage(int damage) {

    }
}
