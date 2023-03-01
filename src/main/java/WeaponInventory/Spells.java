package WeaponInventory;

public enum Spells {

    ITCHYTICKLES (1, 1),
    LIGHTNINGBOLT (4, 2),
    FROZENGSLAP (5, 3),
    FIREBALL (7, 4),
    METEOSHOWER (10, 10),
    ;

    private final int damage;
    private final int spellCost;

    Spells (int damage, int spellCost){
        this.damage = damage;
        this.spellCost = spellCost;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpellCost() {
        return spellCost;
    }
}