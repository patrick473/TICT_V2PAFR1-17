package overerving;

public class OndersteunendPersoneel extends Personeel{
	private String functie;

	public OndersteunendPersoneel(String naam, String type, Integer personeelsID, Boolean onderwijzend,String functie) {
		super(naam, type, personeelsID, onderwijzend);
		this.functie = functie;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return super.toString()+"OndersteunendPersoneel{" +
				"functie='" + functie + '\'' +
				'}';
	}
}
