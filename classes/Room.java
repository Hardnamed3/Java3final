import java.util.ArrayList;
public class Room {
    ArrayList<Enemy> Enemies = new ArrayList<Enemy>();

    public static void main(String[] args) {
        Room r = new Room();
        r.addEnemy(new Enemy());
        r.Refresh();
    }

    public void addEnemy(Enemy e){
        this.Enemies.add(e);
    }
    public void Refresh(){
        for (int i = 0; i < Enemies.size(); i++) {
            System.out.println(Enemies.get(i));
        }
    }
}
