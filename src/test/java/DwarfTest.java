import Players.Physical.Dwarf;
import WeaponInventory.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    @Before
    public void setUp(){
        dwarf = new Dwarf("Brandy");

    }

    @Test
    public void canGetName(){
        assertEquals("Brandy", dwarf.getName());
    }

    @Test
    public void canGetLife(){
        assertEquals(20, dwarf.getLife());
    }

    @Test
    public void canGetStrength(){
        assertEquals(8, dwarf.getStrength());
    }

    @Test
    public void canGetDefense(){
        assertEquals(8, dwarf.getDefense());
    }

    @Test
    public void canGetAllowedWeapon(){
        assertEquals(Weapon.CLUB, dwarf.getAllowedWeapons().get(0));
    }
    @Test
    public void canAddAllowedWeapon(){
        ArrayList<Weapon> newList = new ArrayList<>(Arrays.asList(Weapon.CLUB, Weapon.DAGGER));
        dwarf.setAllowedWeapons(newList);
        assertEquals(Weapon.CLUB, dwarf.getAllowedWeapons().get(0));
        assertEquals(2, dwarf.getAllowedWeapons().size());
    }
    @Test
    public void cantAddIllegalWeapon(){
        ArrayList<Weapon> newList = new ArrayList<>(Arrays.asList(Weapon.CLUB, Weapon.AMULET));
        dwarf.setAllowedWeapons(newList);
        assertEquals(Weapon.CLUB, dwarf.getAllowedWeapons().get(0));
        assertEquals(1, dwarf.getAllowedWeapons().size());
    }

    @Test
    public void canChangeCurrentWeapon(){
        dwarf.setCurrentWeapon(Weapon.DAGGER);
        assertEquals(Weapon.DAGGER, dwarf.getCurrentWeapon());
    }





}
