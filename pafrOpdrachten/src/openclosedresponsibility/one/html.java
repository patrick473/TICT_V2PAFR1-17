package openclosedresponsibility.one;

/**
 * Created by patrick on 11/16/2017.
 */
public class html extends Extension {

    public html(String name) {
        super(name);
    }

    @Override
    public void save( ){
        System.out.println(super.name+".html");
    }
}
