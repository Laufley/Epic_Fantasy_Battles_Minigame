package Rooms;
import Players.Character;

public class FightRoom extends Room{
    private Character player;
    private Character enemy;
//    maybe add an effect?

//    constructor
    public FightRoom(String name, Character player, Character enemy) {
        super(name);
        this.player = player;
        this.enemy = enemy;
    }
//    overloaded constructor with description
public FightRoom(String name, String description, Character player, Character enemy) {
    super(name, description);
    this.player = player;
    this.enemy = enemy;
}


    // setters & getters
    public Character getPlayer() {
        return player;
    }
    public void setPlayer(Character player) {
        this.player = player;
    }
    public Character getEnemy() {
        return enemy;
    }
    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }
}
