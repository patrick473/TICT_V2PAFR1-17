package overerving;

public class Docent extends Personeel{

	private String vak;
	public Docent(String naam, String type, Integer personeelsID, Boolean onderwijzend,String vak) {
		super(naam, type, personeelsID, onderwijzend);
		this.vak = vak;
		// TODO Auto-generated constructor stub
	}

}
