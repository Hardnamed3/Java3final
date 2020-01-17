public abstract class Armor {
    protected int Def_Bonus;
    protected String partOfBody;
    protected String Name;

    public Armor() {


    }

    public double getDef_Bonus()
    {
        return Def_Bonus;
    }
    public String getPartOfBody()
    {
        return partOfBody;
    }

    public String getName()
    {
        return "dont have a name";
    }


}
