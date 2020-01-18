package Enemy;

import java.util.*;

public abstract class Enemy {
    protected int hp;
    protected int atk;
    protected int def;
    protected String Name;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setName(String name) {
        Name = name;
    }

    public Enemy() {

    }

    public int getDmg() {
        return atk;
    }

    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }

    public String getName() {
        return Name;
    }

    public abstract String SpecialMove();

}
