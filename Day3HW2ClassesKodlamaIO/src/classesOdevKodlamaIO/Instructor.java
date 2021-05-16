package classesOdevKodlamaIO;

public class Instructor extends User{
	String _firstName;
	String _lastName;
	int _age;
	String _courseGiven;
	String _userType ="Instructor ";
	private int _instructorId;
	public int getInstructorId() {
		return _instructorId;
	}
	public void setInstructorId(int instructorId) {
		this._instructorId = instructorId;
	}
}
