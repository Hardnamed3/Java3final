package Equipment;

import Equipment.Armor;

public class WoodenShield extends Armor {
    public WoodenShield(){
        Def_Bonus = 5;
        partOfBody = "Left hand";
        Name = "WoodenShield";
    }
    public String getName(){
        super.getName();
        return Name;
    }
}
