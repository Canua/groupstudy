package basicjava.chapter6;

public class Exercise6_4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.no = 1;
		s.ban = 1;
		s.eng = 70;
		s.math = 87;
		s.kor = 83;

		System.out.println("총점은 : " + s.getTotal());
		System.out.println("평균은 : " + s.getAverage());
		System.out.println(s.info());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5) / 10f;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();

	}
}
