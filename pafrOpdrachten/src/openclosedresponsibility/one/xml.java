package openclosedresponsibility.one;

/**
 * Created by patrick on 11/16/2017.
 */
public class xml extends Extension {
    public xml(String name) {
        super(name);
    }

    @Override
    public void save( ){
        System.out.println(super.name+".xml");
    }
}


