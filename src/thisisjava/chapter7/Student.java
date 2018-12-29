package thisisjava.chapter7;

public class Student extends People {
	int studentNo;

	public Student(String name, String ssn) {
		super(name, ssn);
	}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
