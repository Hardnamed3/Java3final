import java.util.*;

public abstract class Enemy {
    protected int hp;
    protected int atk;
    protected int def;
    public Enemy()
    {

    }
    public int getDmg()
    {
        return atk;
    }
    public int getHp()
    {
        return hp;
    }
    public int getDef()
    {
        return def;
    }

}
