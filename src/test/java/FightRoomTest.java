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

    @Before
    public void setUp() {
        galahad = new Knight("Galahad");
        dwarf = new Dwarf("Brandy");
        dungeon = new FightRoom("Dungeon", galahad, dwarf);
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
    
}
