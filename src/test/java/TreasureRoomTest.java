import Players.Physical.Dwarf;
import Players.Physical.Knight;
import Players.Character;
import Rooms.Room;
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
        palace.addTreasure("Gold!");
        assertEquals("Gold!", palace.getTreasureList().get(0));
        assertEquals(1, palace.getTreasureList().size());
    }
    @Test
    public void canRemoveTreasureFromRoomList(){
        String diamonds = "diamonds";
        palace.addTreasure(diamonds);
        palace.addTreasure("Gold!");
        palace.addTreasure("Platinum");
        assertEquals("Gold!", palace.getTreasureList().get(1));

        assertEquals(3, palace.getTreasureList().size());
        assertEquals(true, palace.removeTreasure(diamonds));
        assertEquals(2, palace.getTreasureList().size());
    }

    @Test
    public void characterCanObtainTreasure(){

    }


}