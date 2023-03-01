import Players.Creatures.GiantFrenziedGoose;
import WeaponInventory.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GooseTest {

    GiantFrenziedGoose goose;
    @Before
    public void setUp(){

        goose = new GiantFrenziedGoose();
    }

    @Test
    public void canGetName(){
        assertEquals("Gustav", goose.getName());
    }

    @Test
    public void canGetWarCry(){
        assertEquals("CuackCuack motherducker", goose.getWarCry());
    }

    @Test
    public void canGetPetAsAWeapon(){
        assertEquals(Weapon.GOOSE, goose.getWeapon());
    }
}
