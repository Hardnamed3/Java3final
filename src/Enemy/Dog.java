package Enemy;

public class Dog extends Enemy {
    public Dog() {
        hp = 40;
        atk = 2;
        def = 8;
        Name = "Wild Dog";
    }

    @Override
    public String SpecialMove() {
        return "The "+Name+" barks at you";
    }
}
