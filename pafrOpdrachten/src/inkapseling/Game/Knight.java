package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class Knight extends Character {

    public Knight() {
        setStrength(2);
    }

    public void fight() {
        weapon.useWeapon(strength);
        // other fighting behaviors
    }

}
