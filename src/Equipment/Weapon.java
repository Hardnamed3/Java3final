package Equipment;

public abstract class Weapon
{
    protected int DmgBonus;
    protected String partOfBody;
    public Weapon()
    {

    }
    public int getDmgBonus()
    {
        return DmgBonus;
    }
    public String getPartOfBody()
    {
        return partOfBody;
    }

}
