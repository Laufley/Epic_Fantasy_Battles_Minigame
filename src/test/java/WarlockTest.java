import Players.Magic.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    @Before
    public void setUp(){
        warlock = new Warlock("Radagast");
    }

    @Test
    public void canGetName(){
        assertEquals("Radagast", warlock.getName());
    }

    @Test
    public void canGetLife(){
        assertEquals(3, warlock.getLife());
    }

    @Test
    public void canGetStrenght(){
        assertEquals(12, warlock.getStrength());
    }

    @Test
    public void canGetDefense(){
        assertEquals(4, warlock.getDefense());
    }

    @Test
    public void canGetSP(){
        assertEquals(10, warlock.getSP());
    }

}
