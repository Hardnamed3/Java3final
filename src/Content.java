import Enemy.*;
import net.codestudent.main.Control;

public class Content {
    //unit testing,
    // done:packages, switch case, extra methods, special move for enemy, custom exception
    public static void main(String[] args) {
        Player player = new Player();
        Battle battle = new Battle();
        Enemy zombie = new Zombie();
        Enemy dog = new Dog();
        Enemy skeleton = new Skeleton();
        Enemy boss = new Boss();

        Control.printHeading("Welcome to (name goes here)");
        Control.anythingToContinue();
        Control.printHeading("Create your character!");
        String Name = Control.readString("What is your name?");
        player.setName(Name);

        CharCreate.CreateCharacter(player, Name);

        try{
            battle.battle(dog, player);
            battle.battle(skeleton, player);
            battle.battle(zombie, player);
            battle.battle(boss, player);
        }catch (CustomException c){System.out.println("You died, game over.");}
        System.out.println("That's the end of the demo!");
        Control.anythingToContinue();
    }


}
