package Equipment;

import Equipment.Armor;

public class LeatherArmor extends Armor {

    public LeatherArmor()
    {
        Def_Bonus = 3;
        partOfBody = "Armor";
        Name = "Leather Armor";

    }
    public String getName(){
        super.getName();
        return Name;
    }
}
