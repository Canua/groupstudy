package thisisjava.chapter7;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123-456", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssm : " + student.ssn);
		Student student2 = new Student("손오공", "456-789");
		System.out.println("name : " + student2.name);
		System.out.println("ssm : " + student2.ssn);
	}
}
