package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class Mace implements  Weapon{
    @Override
    public void useWeapon(int strength) {
        System.out.println("Swing a mace and kill "+strength);
    }

}
