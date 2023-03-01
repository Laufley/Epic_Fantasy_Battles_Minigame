package Players.Physical;

import WeaponInventory.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class Barbarian extends Physical {

    public Barbarian(String name) {
        super(name, 12, 16, 8, new ArrayList<Weapon>(Arrays.asList(Weapon.SLING)), new ArrayList<Weapon>(Arrays.asList(Weapon.CLUB, Weapon.DAGGER)));
        this.getInventoryWeapons().add(Weapon.SLING);
        this.getAllowedWeapons().addAll(Arrays.asList(Weapon.SLING, Weapon.SWORD, Weapon.CLUB));
    }

}
