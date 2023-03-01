package Rooms;

import Players.Character;
import java.util.ArrayList;

public class TreasureRoom extends Room {
    private ArrayList<String> treasure_list;
    private Character player;

//    constructor
    public TreasureRoom(String location, Character input_player) {
        super(location);
        this.player = input_player;
        this.treasure_list = new ArrayList<>();
    }
    // overloaded constructor (with description)
    public TreasureRoom(String location, String description, Character input_player) {
        super(location, description);
        this.player = input_player;
        this.treasure_list = new ArrayList<>();
    }

    //setters & getters
    public ArrayList<String> getTreasureList() {
        return treasure_list;
    }
    public void setTreasureList(ArrayList<String> treasure) {
        this.treasure_list = treasure;
    }
    public Character getPlayer() {
        return player;
    }
    public void setPlayer(Character player) {
        this.player = player;
    }


    // methods
    public void addTreasure(String treasure_to_add){
        this.getTreasureList().add(treasure_to_add);
    }
    public boolean removeTreasure(String treasure_to_remove){
        if (this.getTreasureList().contains(treasure_to_remove)){
            this.getTreasureList().remove(treasure_to_remove);
            return true;
        }
        return false;
    }


}
