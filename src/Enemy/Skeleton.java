package Enemy;

public class Skeleton extends Enemy {
    public Skeleton() {
        hp = 50;
        atk = 5;
        def = 2;
        Name = "Skeleton";
    }

    @Override
    public String SpecialMove() {
        return "The "+Name+" rattles its bones at you";
    }
}
