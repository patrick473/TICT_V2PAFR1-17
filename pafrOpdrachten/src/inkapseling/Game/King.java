package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class King extends Character {

    public King() {
        setStrength(4);
    }

    public void fight() {
        weapon.useWeapon(strength);
        // other fighting behaviors
    }

}

