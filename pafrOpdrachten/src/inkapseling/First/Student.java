package inkapseling.First;

/**
 * Created by patrick on 11/13/2017.
 */
public class Student {
    private String voornaam;
    private String achternaam;
    private Integer id;

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(String voornaam, String achternaam, Integer id) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.id = id;
    }

}
