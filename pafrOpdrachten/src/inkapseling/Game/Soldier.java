package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class Soldier extends Character {

    public Soldier() {
        setStrength(1);
    }

    public void fight() {
        weapon.useWeapon(strength);
        // other fighting behaviors
    }

}
