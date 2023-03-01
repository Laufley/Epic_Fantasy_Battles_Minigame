package WeaponInventory;

public enum Weapon {

    SWORD (8, 10, "handWeapon"),
    DAGGER (5, 9, "handWeapon"),
    CLUB (10, 8, "handWeapon"),
    SLING (4, 10, "rangeWeapon"),
    AMULET (5, 7, "magicWeapon")
    ;

    private final int damage;
    private final int durability;
    private final String type;

    Weapon (int damage, int durability, String type){
    this.damage = damage;
    this.durability = durability;
    this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public int getDurability() {
        return durability;
    }

    public String getType() {
        return type;
    }


}
