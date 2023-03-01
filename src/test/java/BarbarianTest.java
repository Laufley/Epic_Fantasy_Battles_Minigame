import Players.Physical.Barbarian;
import Players.Physical.Dwarf;
import WeaponInventory.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void setUp() {
        barbarian = new Barbarian("Cronk");

    }

    @Test
    public void canGetName() {
        assertEquals("Cronk", barbarian.getName());
    }

    @Test
    public void canGetLife() {
        assertEquals(12, barbarian.getLife());
    }

    @Test
    public void canGetStrength() {
        assertEquals(16, barbarian.getStrength());
    }

    @Test
    public void canGetDefense() {
        assertEquals(8, barbarian.getDefense());
    }

    @Test
    public void canGetAllowedWeapon() {
        assertEquals(Weapon.SLING, barbarian.getAllowedWeapons().get(0));
    }

    @Test
    public void canAddAllowedWeapon() {
        ArrayList<Weapon> newList = new ArrayList<>(Arrays.asList(Weapon.SLING, Weapon.SWORD, Weapon.CLUB));
        barbarian.setAllowedWeapons(newList);
//        assertEquals(Weapon.SLING, barbarian.getAllowedWeapons().get(0));
        assertEquals(3, barbarian.getAllowedWeapons().size());
    }

    @Test
    public void cantAddIllegalWeapon() {
        ArrayList<Weapon> newList = new ArrayList<>(Arrays.asList(Weapon.SLING, Weapon.AMULET));
        barbarian.setAllowedWeapons(newList);
        assertEquals(Weapon.SLING, barbarian.getAllowedWeapons().get(0));
        assertEquals(1, barbarian.getAllowedWeapons().size());
    }

    @Test
    public void canChangeCurrentWeapon() {
        barbarian.setCurrentWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, barbarian.getCurrentWeapon());
    }
}