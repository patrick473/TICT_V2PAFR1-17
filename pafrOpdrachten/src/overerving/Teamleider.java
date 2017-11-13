package overerving;

public class Teamleider extends Personeel{
	private String team;
	public Teamleider(String naam, String type, Integer personeelsID, Boolean onderwijzend,String team) {
		super(naam, type, personeelsID, onderwijzend);
		this.team = team;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"Teamleider{" +
				"team='" + team + '\'' +
				'}';
	}
}
