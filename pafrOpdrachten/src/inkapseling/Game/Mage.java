package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class Mage extends Character {

    public Mage() {
        setStrength(0);
    }

    public void fight() {
        weapon.useWeapon(strength);
        // other fighting behaviors
    }

}