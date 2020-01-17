public class Stats {
    private int HP;
    private int ATK;
    private int DEF;

//    public static void main(String[] args) {
//        Stats s = new Stats();
//        s.setATK(10);
//        s.setDEF(12);
//        s.setHP(11);
//        s.refresh();
//    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public void refresh() {
        System.out.print(this.DEF +" "+ this.ATK +" "+ this.HP);
    }
}
