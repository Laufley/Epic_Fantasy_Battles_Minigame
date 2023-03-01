package Rooms;

public enum Treasure {

    GOLD("A Gold Bar", 100, "A bar of pure, shiny Gold."),
    SILVER("A Silver Bar", 70, "A bar of pure silver."),
    BRONZE("A Bronze Bar", 40, "A bar of pure bronze - great for smithing."),
    PLATINUM("A Platinum Bar", 110, "A bar of pure platinum - extremely rare."),
    DIAMONDS("Diamonds", 90, "A small bag of assorted diamonds."),
    DRAGON_SCALE("A Dragon Scale", 80, "A single iridescent scale, super tough, super rare."),
    GEM("A Gem", 60, "This precious stone glimmers in the light. Beautiful."),
    CROWN("A Golden Crown", 200, "An ancient but elegant looking crown. A few scuffs and bumps, but none the less, made of pure gold."),
    SKULL("A Skull", 12, "A human skull, origin unknown."),
    JEWEL_ENCRUSTED_SKULL("A Jewel encrusted skull", 60, "A skull inlaid with small jewels around the crown. Probably best left in place."),
    ;

    private String name;
    private int value;
    private String description;

    Treasure(String name, int value, String desc){
        this.name = name;
        this.value = value;
        this.description = desc;
    }

    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
    public String getDescription(){
        return this.description;
    }
}
