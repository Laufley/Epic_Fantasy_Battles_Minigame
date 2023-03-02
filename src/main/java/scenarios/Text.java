package scenarios;

import Players.Character;
import Players.Physical.Physical;

public class Text {

    public static String fightIntro(Character enemy){
        return String.format("A %s is approaching you for a fight!", enemy.getName());
    }

    public static String chooseYourWeapon(Physical player){
//        choose: a,s,d,f for weapons
//        choose q,w,e,r for items
        return String.format("Choose your weapon: \n - %s (a) \n - %s (s)", player.getInventoryWeapons().get(0), player.getInventoryWeapons().get(1));
    }

    public static String fightOrFlee(){
        return "Fight the enemy (y) || Flee from battle (n)";
    }

    public static String player_attacks(Physical player, Character enemy, int damage) {
        return String.format("%s lunges at %s with their %s, causing %o damage",
                player.getName(),
                enemy.getName(),
                player.getCurrentWeapon(),
                damage);
    }
    public static String fight_stats(Physical player, Character enemy) {
        String playerStats = String.format("%s has %s LP remaining", player.getName(), player.getLife());
        String enemyStats = String.format("%s has %s LP remaining", enemy.getName(), enemy.getLife());

        return playerStats + "\n" + enemyStats + "\n";
    }


}
