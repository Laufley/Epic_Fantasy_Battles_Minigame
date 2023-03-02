package scenarios;

import Players.Character;
import Players.Physical.Physical;
import Rooms.FightRoom;
import Rooms.Room;
import WeaponInventory.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Fight {

    private FightRoom room;
//    private Character player;
    private Physical player; //this needs to be refactored
    private ArrayList<Character> enemies;

    public Fight(FightRoom room, Character player) {
        this.room = room;
        this.player = (Physical) player;
        this.enemies = new ArrayList<>();
    }

    // setters & getters
    public FightRoom getRoom() {
        return room;
    }
    public Character getPlayer() {
        return player;
    }
    public ArrayList<Character> getEnemies() {
        return enemies;
    }
    public Character getFirstEnemy(){ return enemies.get(0); }

    public void setRoom(FightRoom room) {
        this.room = room;
    }
    public void setPlayer(Character player) {
        this.player = (Physical) player;
    }
    public void setEnemies(ArrayList<Character> enemies) {
        this.enemies = enemies;
    }
    public void addEnemy(Character to_add){ this.enemies.add(to_add); }


    // helper methods
    public String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void write(String message){
        System.out.println(message);
    }


//    user questions
    public boolean does_user_want_to_fight(){
        String userChoice = getUserInput();

        if (userChoice.equals("y") ||
                userChoice.equals("yes") ||
                userChoice.equals("yup") ){
            return true;
        }
        return false;
    }
    public Weapon user_choose_weapon(){

        Physical fighter = (Physical) player;

        String userChoice = getUserInput();
        if (userChoice.equals("a")) { return fighter.getInventoryWeapons().get(0); }
        if (userChoice.equals("s")) { return fighter.getInventoryWeapons().get(1); }
        if (userChoice.equals("d")) { return fighter.getInventoryWeapons().get(2);  }
        if (userChoice.equals("f")) { return fighter.getInventoryWeapons().get(3);  }

        return fighter.getCurrentWeapon();
    }


//    stories
    public boolean play_intro() {
        write(Text.fightIntro(getFirstEnemy()));
        write(Text.fightOrFlee());
        return does_user_want_to_fight();
    }

    public void begin_fight() {
        write(Text.chooseYourWeapon(this.player));
        this.player.setCurrentWeapon(user_choose_weapon());

        int damage = this.player.attack(this.getFirstEnemy());
        write(Text.player_attacks(this.player, this.getFirstEnemy(), damage));
        write(Text.fight_stats(this.player, this.getFirstEnemy()));


    }
}
