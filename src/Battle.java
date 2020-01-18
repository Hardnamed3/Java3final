import Enemy.Enemy;
import net.codestudent.main.Control;

import static net.codestudent.main.Control.anythingToContinue;
import static net.codestudent.main.Control.printHeading;

public class Battle implements EasterEgg {

    public void EngageEasterEgg(Player player) {
        System.out.println("You found the easter egg!! health increased");
        player.setHP(1000);
    }

    public void battle(Enemy enemy, Player player) throws CustomException {
        Control c = new Control();
        int MaxPlayerHP = player.getHP();

        //main battle loop
        boolean isFighting = true;
        do {
            System.out.println("You are attacked by " + enemy.getName());
            System.out.println("Choose an action:");
            System.out.println("(1) Fight\n(2) Defend\n(3) Run Away");
            int input = c.readInt("-> ", 4);
            //react accordingly to player input
            if (input == 1) {
                //ATTACK
                //calculate dmg and dmgTook (dmg enemy deals to player)
                int dmg = player.getTotalATK() - enemy.getDef();
                int dmgTook = enemy.getDmg() - player.getTotalDEF() / 3;
                BattleTurn(player, enemy, dmg, dmgTook);
                //check if player is still alive or dead
                if (player.getHP() <= 0) {
                    System.out.println("YOU DIED"); //method to end the game
                    Control.anythingToContinue();
                    Control.clearConsole();
                    isFighting = false;
                } else if (enemy.getHp() <= 0) {
                    //tell the player he won
                    System.out.println("You defeated " + enemy.getName());
                    //restore Player HP
                    player.setHP(MaxPlayerHP);
                    Control.anythingToContinue();
                    Control.clearConsole();
                    isFighting = false;
                }
            } else if (input == 2) {
                //DEFEND
                int dmg = player.getTotalATK() / 3 - enemy.getDef();
                int dmgTook = enemy.getDmg() - player.getTotalDEF();
                BattleTurn(player, enemy, dmg, dmgTook);
                //check if player is still alive or dead
                if (player.getHP() <= 0) {
                    System.out.println("YOU DIED"); //method to end the game
                    throw new CustomException("Player dead");
                    //Control.anythingToContinue();
                    //Control.clearConsole();

                    //isFighting = false;
                } else if (enemy.getHp() <= 0) {
                    //tell the player he won
                    System.out.println("You defeated " + enemy.getName());
                    //restore Player HP
                    player.setHP(MaxPlayerHP);
                    Control.anythingToContinue();
                    Control.clearConsole();
                    isFighting = false;
                }
            } else if (input == 3) {
                //chance of 35% to escape
                if (Math.random() * 10 + 1 <= 3.5) {
                    printHeading("You ran away from the " + enemy.getName() + "!");
                    anythingToContinue();
                    isFighting = false;
                } else {
                    printHeading("You didn't manage to escape.");
                    //calculate damage the player takes
                    int dmgTook = enemy.getDmg();
                    System.out.println("In your hurry you took " + dmgTook + " damage!");
                    int PlayerHP = player.getHP() - dmgTook;
                    player.setHP(PlayerHP);
                    //check if player's still alive
                    if (player.getHP() <= 0) {
                        //playerDied();
                        System.out.println("YOU DIED");
                        throw new CustomException("Player dead");
                        //Control.anythingToContinue();
                        //Control.clearConsole();
                        //isFighting = false;
                    }
                }
            } else if (input == 4) {
                this.EngageEasterEgg(player);
            }
        } while (isFighting);
    }

    public void dealDMG(Player player, Enemy enemy, int dmg, int dmgTook) {
        int PlayerHP = player.getHP() - dmgTook;
        player.setHP(PlayerHP);
        int EnemyHP = enemy.getHp() - dmg;
        enemy.setHp(EnemyHP);
    }

    public void PrintRound(Player player, Enemy enemy, int dmg, int dmgTook) {
        System.out.println("You dealt " + dmg + " damage to the " + enemy.getName());
        System.out.println("The " + enemy.getName() + " dealt " + dmgTook + " damage to you.");
        System.out.println(enemy.SpecialMove());
        System.out.println("Your HP: " + player.getHP());
        System.out.println("Enemy HP: " + enemy.getHp());
    }

    public void BattleTurn(Player player, Enemy enemy, int dmg, int dmgTook) {
        //check that dmg and dmgTook isn't negative
        if (dmgTook < 0) {
            //add some dmg if player defends very well
            dmg -= dmgTook / 2;
            dmgTook = 0;
        }
        if (dmg < 0)
            dmg = 0;
        //deal damage to both parties
        dealDMG(player, enemy, dmg, dmgTook);
        //print the info of this battle round
        PrintRound(player, enemy, dmg, dmgTook);

    }
}
