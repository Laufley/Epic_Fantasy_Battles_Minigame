import Players.Physical.Dwarf;
import Players.Physical.Knight;
import WeaponInventory.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight galahad;

    @Before
    public void setUp() {
        galahad = new Knight("Galahad");
    }

    @Test
    public void canGetName() {
        assertEquals("Galahad", galahad.getName());
    }
    @Test
    public void canGetLife(){
        assertEquals(12, galahad.getLife());
    }
    @Test
    public void canGetDefense(){
        assertEquals(16, galahad.getDefense());
    }
    @Test
    public void canGetStrength(){
        assertEquals(8, galahad.getStrength());
    }
    @Test
    public void canGetAllowedWeapons(){
        assertEquals(3, galahad.getAllowedWeapons().size());
    }
    @Test
    public void canAddAllowedWeapon(){
        ArrayList<Weapon> newList = new ArrayList<>(Arrays.asList(Weapon.CLUB, Weapon.DAGGER));
        galahad.setAllowedWeapons(newList);
        assertEquals(Weapon.CLUB, galahad.getAllowedWeapons().get(0));
        assertEquals(2, galahad.getAllowedWeapons().size());
    }
    @Test
    public void cantAddIllegalWeapon(){
        ArrayList<Weapon> newList = new ArrayList<>(Arrays.asList(Weapon.CLUB, Weapon.AMULET));
        galahad.setAllowedWeapons(newList);
        assertEquals(Weapon.CLUB, galahad.getAllowedWeapons().get(0));
        assertEquals(1, galahad.getAllowedWeapons().size());
    }
    @Test
    public void canChangeCurrentWeapon(){
        galahad.setCurrentWeapon(Weapon.DAGGER);
        assertEquals(Weapon.DAGGER, galahad.getCurrentWeapon());
    }


}

