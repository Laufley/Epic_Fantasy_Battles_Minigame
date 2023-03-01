package Players.Magic;

import Players.behaviours.iAttack;
import Players.behaviours.iDefend;
import WeaponInventory.Spells;

public class Warlock extends Magic{

    public Warlock(String name){
        super(name, 3, 12, 4, 10);
    }

    public void attack(){};
}


