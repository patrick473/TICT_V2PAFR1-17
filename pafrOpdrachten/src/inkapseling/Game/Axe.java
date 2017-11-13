package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */

public class Axe implements Weapon {

    @Override
    public void useWeapon(int strength) {
        System.out.println("Chop an axe and kill "+strength);
    }

}
