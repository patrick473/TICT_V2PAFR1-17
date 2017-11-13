package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class Sword implements Weapon {

    @Override
    public void useWeapon(int strength) {
        System.out.println("Swing a sword and kill "+strength);
    }

}

