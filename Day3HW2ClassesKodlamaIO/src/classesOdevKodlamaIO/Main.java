package classesOdevKodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor1 = new Instructor();
		Student student1= new Student();
		instructor1._age= 25;
		instructor1._eMail = "example@gmail.com";
		instructor1._firstName = "Aslan";
		instructor1._lastName = "Demir";
		instructor1._courseGiven = "Java & React";
		instructor1._id=1;
		instructor1.setInstructorId(1);
		System.out.println(instructor1.getInstructorId());
		System.out.println(instructor1._userType);
		System.out.println(instructor1._courseGiven);
		System.out.println(instructor1._id);
		

		student1._age = 33;
		student1._eMail = "example2@gmail.com";
		student1._firstName = "Kemal";
		student1._lastName = "Kara";
		student1._courseTaken = "Java & React";
		student1._id=2;
		student1.setStudentId(1);
		System.out.println(student1.getStudentId());
		System.out.println(student1._userType);
		
		Student student2 = new Student();
		student2 ._age = 35;
		student2._eMail = "example2@gmail.com";
		student2._firstName = "Kemal";
		student2._lastName = "Kara";
		student2._courseTaken = "Java & React";
		student2._id = 3;
		student2.setStudentId(2);
		System.out.println(student2.getStudentId());
		System.out.println(student2._userType);
		System.out.println(student2._courseTaken);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.removeStudentFromCourse(student2);
		UserManager userManager = new UserManager();
		userManager.updateUser(student2);	
	

	}
	
	

}
