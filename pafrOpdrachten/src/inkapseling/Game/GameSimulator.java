package inkapseling.Game;

/**
 * Created by patrick on 11/13/2017.
 */
public class GameSimulator {
    public static void main(String[] args) {

        Character arthur = new King();
        Character jos = new Mage();
        Weapon excalibur = new Sword();
        Weapon dagger = new Knife();
        Weapon mace = new Mace();
        arthur.setWeapon(excalibur);
        arthur.fight();
        jos.setWeapon(mace);
        jos.fight();
        arthur.setWeapon(dagger);
        arthur.fight();

    }

}
