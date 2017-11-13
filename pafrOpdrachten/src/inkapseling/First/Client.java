package inkapseling.First;

/**
 * Created by patrick on 11/13/2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Client
{
    public static void main(String...args)
    {
        List<Student> ls = new ArrayList<Student>();
        Student s1 = new Student("jeroen","weber",1234567);
        ls.add(s1);
        Student s2 = new Student("kees","haverkamp",1234568);
        ls.add(s2);
//………
        Docent d1 = new Docent("martijn","jansen",1234566);
        d1.setKlas(ls);
       System.out.println( d1.getKlas());
    }


}
