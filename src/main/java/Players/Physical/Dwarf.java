package Players.Physical;

import WeaponInventory.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class Dwarf extends Physical{

    public Dwarf(String name){
        super(name, 20, 8, 8, new ArrayList<Weapon>(Arrays.asList(Weapon.CLUB)), new ArrayList<Weapon>(Arrays.asList(Weapon.CLUB, Weapon.DAGGER)));
        this.getInventoryWeapons().add(Weapon.CLUB);
        this.getAllowedWeapons().addAll(Arrays.asList(Weapon.CLUB, Weapon.DAGGER));
    }





}
