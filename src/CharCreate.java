import Equipment.LeatherArmor;
import Equipment.WoodenShield;
import Equipment.WoodenSword;
import net.codestudent.main.Control;

public class CharCreate {

    public static void EngageEasterEgg(Player player) {
        System.out.println("You found the Easter Egg");
        player.setStats(1, 1, 1);
        System.out.println("Welcome " + player.getName() + " the Easter Bunny");
        GearPlayer(player);
    }

    public static void CreateCharacter(Player player, String Name) {
        System.out.println("Choose your class: Warrior, Thief, Viking");
        int input = Control.readInt("Enter 1, 2 or 3: ", 4);
        //sc
        switch (input) {
            case 1:
                System.out.println("You chose Warrior ");
                player.setStats(50, 12, 12);
                System.out.println("Welcome " + Name + " the Warrior");
                GearPlayer(player);
                break;
            case 2:
                System.out.println("You chose Thief ");
                player.setStats(40, 7, 20);
                System.out.println("Welcome " + Name + " the Thief");
                GearPlayer(player);
                break;
            case 3:
                System.out.println("You chose Viking ");
                player.setStats(120, 4, 15);
                System.out.println("Welcome " + Name + " the Viking");
                GearPlayer(player);
                break;
            case 4:
                EngageEasterEgg(player);
                break;
        }
        Control.anythingToContinue();
        Control.clearConsole();
    }

    private static void GearPlayer(Player player) {
        player.EquipWeapon("Right hand", new WoodenSword());
        player.EquipArmor("Left hand", new WoodenShield());
        player.EquipArmor("Equipment.Armor", new LeatherArmor());
        System.out.println();
        System.out.println("Your stats are: ");
        System.out.println();
        Control.printHeading("" + player);
    }
}
