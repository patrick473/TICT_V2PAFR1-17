package overerving;

public class Persoon {
 private String naam;
 private String type;
public Persoon(String naam, String type) {
	
	this.naam = naam;
	this.type = type;
}


    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
