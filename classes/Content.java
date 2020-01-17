import net.codestudent.main.Control;

public class Content {
//    private String Display;
//
//    public void PrintDetails() {
//        System.out.print("");
//    }
    public static void main(String[] args) {
        Player player = new Player();



        Control.printHeading("Create your character!");
        String Name = Control.readString("What is your name?");
        player.setName(Name);

        System.out.println("Choose your class: Warrior, Thief, Viking");
        int input = Control.readInt("Enter 1, 2 or 3: ", 3);
        if(input == 1){
            System.out.println("You chose Warrior ");
            player.setStats(50,12,12);
            System.out.println("Welcome "+ Name +" the Warrior");
            player.EquipWeapon("Right hand", new WoodenSword());
            player.EquipArmor("Left hand", new WoodenShield());
            player.EquipArmor("Armor", new LeatherArmor());
            System.out.println("Your stats are: "+player);
        }else if(input == 2){
            System.out.println("You chose Thief ");
            player.setStats(40,7,20);
            System.out.println("Welcome "+ Name +" the Thief");
            player.EquipWeapon("Right hand", new WoodenSword());
            player.EquipArmor("Left hand", new WoodenShield());
            player.EquipArmor("Armor", new LeatherArmor());
            System.out.println("Your stats are: "+player);
        }else if(input == 3){
            System.out.println("You chose Viking ");
            player.setStats(120,4,15);
            System.out.println("Welcome "+ Name +" the Viking");
            player.EquipWeapon("Right hand", new WoodenSword());
            player.EquipArmor("Left hand", new WoodenShield());
            player.EquipArmor("Armor", new LeatherArmor());
            System.out.println("Your stats are: "+player);
        }

        Control.anythingToContinue();
        Control.clearConsole();

    }
}
