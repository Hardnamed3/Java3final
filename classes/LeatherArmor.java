public class LeatherArmor extends Armor {

    public LeatherArmor()
    {
        Def_Bonus = 3;
        partOfBody = "Chest";
        Name = "Leather Armor";

    }
    public String getName(){
        super.getName();
        return Name;
    }
}
