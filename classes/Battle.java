import net.codestudent.main.Control;

import java.util.HashMap;

import static net.codestudent.main.Control.anythingToContinue;
import static net.codestudent.main.Control.printHeading;

public class Battle implements EasterEgg {
    public void EngageEasterEgg(Player player){
        System.out.println("You and the enemy smoke a blunt");
        player.setHP(1000);
    }
    public static void main(String[] args) {
        Enemy z = new Boss();


        Player Playera = new Player();
        Playera.setStats(80,10,13);
        Playera.Weapons.put("Right hand", null);
        //Playera.Armors.put("Left hand", null);
        //Playera.Armors.put("Chest", null);
        //Playera.Armors.put("Legs", null);
        //Playera.Armors.put("Feet", null);
        //Playera.Armors.put("Head", null);

        Playera.EquipWeapon("Right hand", new WoodenSword());
        Playera.EquipArmor("Chest", new LeatherArmor());
        Battle b = new Battle();
        b.battle(z, Playera);
    }
    public void battle(Enemy enemy, Player player){
        Control c = new Control();

        //main battle loop
        while(true){
            System.out.println("Choose an action:");
            System.out.println("(1) Fight\n(2) Defend\n(3) Run Away");
            int input = c.readInt("-> ", 4);
            //react accordingly to player input
            if(input == 1){
                //ATTACK
                //calculate dmg and dmgTook (dmg enemy deals to player)
                int dmg = player.getTotalATK() - enemy.getDef();
                int dmgTook = enemy.getDmg() - player.getTotalDEF()/3;
                //check that dmg and dmgTook isn't negative
                if(dmgTook < 0){
                    //add some dmg if player defends very well
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if(dmg < 0)
                    dmg = 0;
                //deal damge to both parties
                int PlayerHP = player.getHP() - dmgTook;
                player.setHP(PlayerHP);
                enemy.hp -= dmg;
                //print the info of this battle round
                System.out.println("You dealt " + dmg + " damage to the ");
                System.out.println("The " +" dealt " + dmgTook + " damage to you.");

                //check if player is still alive or dead
                if(player.getHP() <= 0){
                    System.out.println("YOU DIED"); //method to end the game
                    break;
                }else if(enemy.hp <= 0){
                    //tell the player he won
                    System.out.println("You defeated");
                    break;
                }
            }else if(input == 2){
                //DEFEND
                int dmg = player.getTotalATK()/3 - enemy.getDef();
                int dmgTook = enemy.getDmg() - player.getTotalDEF();
                //check that dmg and dmgTook isn't negative
                if(dmgTook < 0){
                    //add some dmg if player defends very well
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if(dmg < 0)
                    dmg = 0;
                //deal damge to both parties
                int PlayerHP = player.getHP() - dmgTook;
                player.setHP(PlayerHP);
                enemy.hp -= dmg;
                //print the info of this battle round
                System.out.println("You dealt " + dmg + " damage to the ");
                System.out.println("The " +" dealt " + dmgTook + " damage to you.");
                //check if player is still alive or dead
                if(player.getHP() <= 0){
                    System.out.println("YOU DIED"); //method to end the game
                    break;
                }else if(enemy.hp <= 0) {
                    //tell the player he won
                    System.out.println("You defeated");
                    break;
                }
            }else if(input == 3){
                //RUN AWAY you coward
                //check that player isn't in last act (final boss battle)

                    //chance of 35% to escape
                    if(Math.random()*10 + 1 <= 3.5){
                        printHeading("You ran away from the " +"!");
                        anythingToContinue();
                        break;
                    }else{
                        printHeading("You didn't manage to escape.");
                        //calculate dmage the player takes
                        int dmgTook = enemy.getDmg();
                        System.out.println("In your hurry you took " + dmgTook + " damage!");
                        anythingToContinue();
                        //check if player's still alive
                        if(player.getHP() <= 0)
                            //playerDied();
                            anythingToContinue();
                    }

            }else if(input == 4){
                this.EngageEasterEgg(player);
                break;
            }

            }
        }
    }
