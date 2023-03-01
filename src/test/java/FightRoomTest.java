import Players.Creatures.GiantFrenziedGoose;
import Players.Magic.Wizard;
import Players.Physical.Dwarf;
import Players.Physical.Knight;
import Players.Character;
import Rooms.FightRoom;
import Rooms.Room;
import WeaponInventory.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FightRoomTest {

    Knight galahad;
    Dwarf dwarf;
    FightRoom dungeon;
    Wizard merlin;
    GiantFrenziedGoose gustav;

    @Before
    public void setUp() {
        galahad = new Knight("Galahad");
        dwarf = new Dwarf("Brandy");
        dungeon = new FightRoom("Dungeon", galahad, dwarf);
        merlin = new Wizard("Merlin");
        gustav = new GiantFrenziedGoose();
    }

    @Test
    public void canGetName() {
        assertEquals("Dungeon", dungeon.getLocation());
    }
    @Test
    public void canGetPlayer() {
        assertEquals(galahad, dungeon.getPlayer());
    }
    @Test
    public void canGetEnemy() {
        assertEquals(dwarf, dungeon.getEnemy());
    }
    @Test
    public void playerCanDamageEnemy(){
        galahad.attack(dwarf);
        assertEquals(8, dwarf.getLife());

    }
    @Test
    public void magicalPlayerCanDamageEnemy(){
        merlin.attack(dwarf);
        assertEquals(4, dwarf.getLife());
    }
    @Test
    public void magicalPlayerCanDamageEnemeyWithGoose(){
        merlin.setCurrentWeapon(Weapon.GOOSE);
        merlin.attack(dwarf);
        assertEquals(-1, dwarf.getLife());
    }
    @Test
    public void enemyCanDamagePlayer(){

    }

}
