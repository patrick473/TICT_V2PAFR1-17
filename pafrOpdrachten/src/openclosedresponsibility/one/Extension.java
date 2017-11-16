package openclosedresponsibility.one;

/**
 * Created by patrick on 11/16/2017.
 */
public abstract class Extension {
    String name;

    public Extension(String name) {
        this.name = name;
    }

    abstract void save();
}
