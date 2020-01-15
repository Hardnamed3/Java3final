import java.util.HashMap;

public class Player {
    private String Name;
    private HashMap<String, Weapon> Weapons = new HashMap<String, Weapon>();
    private HashMap<String, Armor> Armors = new HashMap<String, Armor>();
    private Stats PlayerStats = new Stats();

    public static void main(String[] args) {
        Player Playera = new Player();
        Playera.setStats(60,12,15);
        Playera.Weapons.put("Right hand", null);
        //Playera.Armors.put("Left hand", null);
        Playera.Armors.put("Chest", null);
        //Playera.Armors.put("Legs", null);
        //Playera.Armors.put("Feet", null);
        //Playera.Armors.put("Head", null);

        Playera.EquipWeapon("Right hand", new WoodenSword());
        Playera.EquipArmor("Chest", new LeatherArmor());

        //Playera.Refresh();
        System.out.print(Playera.attack());
        System.out.print(Playera.defend());

    }

    public void setStats(int HP, int DEF, int ATK){
        this.PlayerStats.setHP(HP);
        this.PlayerStats.setDEF(DEF);
        this.PlayerStats.setATK(ATK);
    }

    public void EquipWeapon(String s, Weapon w){
        Weapons.put("Right hand", w);
    }
    public void EquipArmor(String s, Armor a){
        Armors.put("Chest", a);
    }

    public int attack() {
        return (int) (Math.random()*10 + this.getTotalATK());
    }

    public int defend() {
        return (int) (Math.random()*10 + this.getTotalDEF());
    }

    public int getTotalDEF(){
        int total = 0;
        total+=this.PlayerStats.getDEF();
        for (String i : this.Armors.keySet()) {
            total+=this.Armors.get(i).Def_Bonus;
        }
        return total;
    }
    public int getTotalATK(){
        int total = 0;
        total+=this.PlayerStats.getATK();
        total+=this.Weapons.get("Right hand").DmgBonus;
        return total;
    }

    public void Refresh(){

    }

}
