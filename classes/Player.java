import java.util.HashMap;

public class Player extends Stats{
    private String Name;
    public HashMap<String, Weapon> Weapons = new HashMap<String, Weapon>();
    public HashMap<String, Armor> Armors = new HashMap<String, Armor>();
    //private Stats PlayerStats = new Stats();

    public static void main(String[] args) {
        Player Playera = new Player();
        Playera.setStats(60,10,15);
        Playera.setName("Bob the Viking");
        Playera.Weapons.put("Right hand", null);
        //Playera.Armors.put("Left hand", null);
        Playera.Armors.put("Armor", null);
        //Playera.Armors.put("Legs", null);
        //Playera.Armors.put("Feet", null);
        //Playera.Armors.put("Head", null);

        Playera.EquipWeapon("Right hand", new WoodenSword());
        Playera.EquipArmor("Armor", new LeatherArmor());

        //Playera.Refresh();
        //System.out.print(Playera.attack());
       // System.out.print(Playera.defend());
        System.out.print(Playera);


    }
    public Player(){
        Weapons.put("Right hand", null);
        Armors.put("Left hand", null);
        Armors.put("Armor", null);
        //Armors.put("Legs", null);
        //Armors.put("Feet", null);
        //Armors.put("Head", null);
    }
    public void setStats(int HP, int DEF, int ATK){
        this.setHP(HP);
        this.setDEF(DEF);
        this.setATK(ATK);
    }

    public void setName(String name){
        this.Name=name;
    }

    public String getName() {
        return Name;
    }

    public void EquipWeapon(String s, Weapon w){
        Weapons.put(s, w);
    }
    public void EquipArmor(String s, Armor a){
        Armors.put(s, a);
    }

    public int attack() {
        return (int) (Math.random()*10 + this.getTotalATK());
    }

    public int defend() {
        return (int) (Math.random()*10 + this.getTotalDEF());
    }

    public int getTotalDEF(){
        int total = 0;
        total+=this.getDEF();
        for (String i : this.Armors.keySet()) {
            total+=this.Armors.get(i).Def_Bonus;
        }
        return total;
    }
    public int getTotalATK(){
        int total = 0;
        total+=this.getATK();
        total+=this.Weapons.get("Right hand").DmgBonus;
        return total;
    }
//    IF WE WANT TO ADD AN EQUIPMENT SCREEN
    public String printEquipment(){
        String s = "";
        for (String i : this.Armors.keySet()) {
            s += "Part of body: "+this.Armors.get(i).partOfBody;
            s += " " + this.Armors.get(i).getName();
            s += " Def " + this.Armors.get(i).getDef_Bonus();
        }
        return s;
    }

    public String toString(){
        String s="";
        s+="Name: "+getName()+" DEF: "+getTotalDEF()+" ATK: "+getTotalATK()+" HP: "+getHP()+" "+ printEquipment();

        return s;
    }
}
