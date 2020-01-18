package Enemy;

public class Zombie extends Enemy {
    public Zombie() {
        hp = 30;
        atk = 6;
        def = 4;
        Name = "Zombie";
    }

    @Override
    public String SpecialMove() {
        return "The "+Name+" drools on you";
    }
}
