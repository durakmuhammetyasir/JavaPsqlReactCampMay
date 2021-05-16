package classesOdevKodlamaIO;

public class Student extends User{
	String _firstName;
	String _lastName;
	int _age;
	String _courseTaken;
	private int _studentId;
	String _userType = "Student ";
	public int getStudentId() {
		return _studentId;
	}
	public void setStudentId(int studentId) {
		this._studentId = studentId;
	}
}

