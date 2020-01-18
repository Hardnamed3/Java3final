import Equipment.Armor;
import Equipment.Weapon;

import java.util.HashMap;

public class Player extends Stats {
    private String Name;
    public HashMap<String, Weapon> Weapons = new HashMap<String, Weapon>();
    public HashMap<String, Armor> Armors = new HashMap<String, Armor>();

    public Player() {
        Weapons.put("Right hand", null);
        Armors.put("Left hand", null);
        Armors.put("Equipment.Armor", null);
    }

    public void setStats(int HP, int DEF, int ATK) {
        this.setHP(HP);
        this.setDEF(DEF);
        this.setATK(ATK);
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void EquipWeapon(String s, Weapon w) {
        Weapons.put(s, w);
    }

    public void EquipArmor(String s, Armor a) {
        Armors.put(s, a);
    }

    public int attack() {
        return (int) (Math.random() * 10 + this.getTotalATK());
    }

    public int defend() {
        return (int) (Math.random() * 10 + this.getTotalDEF());
    }

    public int getTotalDEF() {
        int total = 0;
        total += this.getDEF();
        for (String i : this.Armors.keySet()) {
            total += this.Armors.get(i).getDef_Bonus();
        }
        return total;
    }

    public int getTotalATK() {
        int total = 0;
        total += this.getATK();
        total += this.Weapons.get("Right hand").getDmgBonus();
        return total;
    }

    //    IF WE WANT TO ADD AN EQUIPMENT SCREEN
    public String printEquipment() {
        String s = "";

        for (String i : this.Armors.keySet()) {
            s += "Part of body: " + this.Armors.get(i).getPartOfBody();
            s += " " + this.Armors.get(i).getName();
            s += " Def " + this.Armors.get(i).getDef_Bonus();
        }
        return s;
    }

    public String toString() {
        String s = "";
        s += "Name: " + getName() + " DEF: " + getTotalDEF() + " ATK: " + getTotalATK() + " HP: " + getHP() + " " + printEquipment();

        return s;
    }
}
