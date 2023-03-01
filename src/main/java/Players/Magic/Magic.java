package Players.Magic;


import Players.Character;
import WeaponInventory.Spells;
import WeaponInventory.Weapon;


import java.util.ArrayList;

public abstract class Magic extends Character {

    private Spells currentSpell;
    private ArrayList<Spells> spellBook;
    private ArrayList<Weapon> petList;
    private ArrayList<Weapon> allowed_pets;
    private Weapon currentWeapon;

    public Magic(String name, int life, int strength, int defense) {
        super(name, life, strength, defense);
        this.currentSpell = Spells.LIGHTNINGBOLT;
        this.spellBook = new ArrayList<Spells>();
        this.petList = new ArrayList<Weapon>();
        this.allowed_pets = new ArrayList<Weapon>();
        this.currentWeapon = Weapon.LIZARD;
    }

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

    public void setCurrentWeapon(Weapon set_to_this){
        this.currentWeapon = set_to_this;
    }
    public Weapon getCurrentWeapon(){
        return this.currentWeapon;
    }

    public void setAllowedPet(ArrayList<Weapon> input_allowedPet) {

        ArrayList<Weapon> returnList = new ArrayList<>();

        for (Weapon weapon : input_allowedPet) {
            if (weapon.getType().equals("Pet")) {
                returnList.add(weapon);
            }
        }
        this.allowed_pets = returnList;

    }

    @Override
    public int getAttackValue(){
        return this.getStrength() + this.getCurrentWeapon().getDamage() + this.getCurrentSpell().getDamage();
    }


}
