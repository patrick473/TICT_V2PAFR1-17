package inkapseling.First;

import java.util.List;
/**
 * Created by patrick on 11/13/2017.
 */
public class Docent {
    private String voornaam;
    private String achternaam;
    private Integer id;
    private List<Student> klas;

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

    public List<Student> getKlas() {
        return klas;
    }

    public void setKlas(List<Student> klas) {
        this.klas = klas;
    }

    public Docent(String voornaam, String achternaam, Integer id) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.id = id;
    }

}
