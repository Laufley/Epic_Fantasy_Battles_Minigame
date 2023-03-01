import Players.Physical.Dwarf;
import Players.Physical.Knight;
import Players.Character;
import Rooms.Room;
import Rooms.Treasure;
import Rooms.TreasureRoom;
import WeaponInventory.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    Knight galahad;
    TreasureRoom palace;
    String treasure;

    @Before
    public void setUp() {
        galahad = new Knight("Galahad");
        palace = new TreasureRoom("Palace Armoury", galahad);
        treasure = "Gold!";
    }
    @Test
    public void canGetLocationName() {
        assertEquals("Palace Armoury", palace.getLocation());
    }
    @Test
    public void canGetPlayer(){
        assertEquals(galahad, palace.getPlayer());
    }
    @Test
    public void canAddtreasure(){
        palace.addTreasure(Treasure.GOLD);
        assertEquals(Treasure.GOLD, palace.getTreasureList().get(0));
        assertEquals(1, palace.getTreasureList().size());
    }
    @Test
    public void canRemoveTreasureFromRoomList(){
        palace.addTreasure(Treasure.DIAMONDS);
        palace.addTreasure(Treasure.GOLD);
        palace.addTreasure(Treasure.PLATINUM);
        assertEquals(Treasure.GOLD, palace.getTreasureList().get(1));

        assertEquals(3, palace.getTreasureList().size());
        assertEquals(true, palace.removeTreasure(Treasure.DIAMONDS));
        assertEquals(2, palace.getTreasureList().size());
    }

    @Test
    public void characterCanObtainTreasure(){
        palace.getPlayer().addTreasure(Treasure.GOLD);
        assertEquals(Arrays.asList(Treasure.GOLD), galahad.getBag() );
        assertEquals(1, palace.getPlayer().getBag().size());
    }
    


}