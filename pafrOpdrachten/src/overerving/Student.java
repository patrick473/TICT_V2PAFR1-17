package overerving;

public class Student extends Persoon{
	private Integer studentID;
	
	public Student(String naam,String type, Integer studentID) {
		super(naam,type);

		this.studentID = studentID;
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return super.toString()+"Student{" +
				"studentID=" + studentID +
				'}';
	}
}
