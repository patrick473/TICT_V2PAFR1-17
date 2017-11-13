package overerving;

public class Personeel extends Persoon {
	private Integer personeelsID;
	private Boolean onderwijzend;
	public Personeel(String naam, String type,Integer personeelsID,Boolean onderwijzend) {
		super(naam, type);
		this.personeelsID = personeelsID;
		this.onderwijzend = onderwijzend;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return super.toString()+ "Personeel{" +
				"personeelsID=" + personeelsID +
				'}';
	}
}
