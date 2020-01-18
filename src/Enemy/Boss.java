package Enemy;

public class Boss extends Enemy {
    public Boss() {
        hp = 300;
        atk = 10;
        def = 10;
        Name = "Undead King";
    }

    @Override
    public String SpecialMove() {
        return "The "+Name+" intimidates you with their presence";
    }
}
