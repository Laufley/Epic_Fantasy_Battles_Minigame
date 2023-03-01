package Players.Magic;


import Players.Character;
import WeaponInventory.Spells;


import java.util.ArrayList;

public abstract class Magic extends Character {

    private Spells currentSpell;
    private ArrayList<Spells> spellBook;

    public Spells getCurrentSpell() {
        return currentSpell;
    }

    public void setCurrentSpell(Spells currentSpell) {
        this.currentSpell = currentSpell;
    }

    public ArrayList<Spells> getSpellBook() {
        return spellBook;
    }

    public void setSpellBook(ArrayList<Spells> spellBook) {
        this.spellBook = spellBook;
    }

    public Magic(String name, int life, int strength, int defense, Spells currentSpell, ArrayList<Spells> spellBook) {
        super(name, life, strength, defense);
        this.currentSpell = Spells.LIGHTNINGBOLT;
        this.spellBook = new ArrayList<Spells>();
    }


}
