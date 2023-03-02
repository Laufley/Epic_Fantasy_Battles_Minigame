import Players.Character;
import Players.Physical.Barbarian;
import Players.Physical.Dwarf;
import Players.Physical.Knight;
import Rooms.FightRoom;
import Rooms.Room;
import WeaponInventory.Weapon;
import scenarios.Fight;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

//        make a new enemy list
        Character dwarf = new Dwarf("Gimli");
//        ArrayList<Character> list_of_enemies = new ArrayList<>();
//        list_of_enemies.add(dwarf);
//        make a new player
        Character galahad = new Knight("Galahad");
        Knight galahad_loadout = (Knight) galahad;
        galahad_loadout.addWeapon(Weapon.SWORD);
        galahad_loadout.addWeapon(Weapon.CLUB);
        galahad_loadout.addWeapon(Weapon.DAGGER);

//        make a new room
        FightRoom dungeon = new FightRoom("Dungeon", galahad, dwarf);


        // ############## //
        // ## scenario ## //
        // ############## //

        Fight dungeon_scenario = new Fight(dungeon, galahad);
        dungeon_scenario.addEnemy(dwarf);

        if (dungeon_scenario.play_intro()){
            dungeon_scenario.begin_fight();
        } else {
            return;
        }
    }
}
