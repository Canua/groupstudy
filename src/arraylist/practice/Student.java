package arraylist.practice;

public class Student {
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;

	public Student() {
	}

	public Student(String name, int num, int kor, int eng, int math, int sum, double avg) {
		this.name = name;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		InputStudentInfo();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSum() {
		return kor + eng + math;
	}

	public void setSum(int sum) {
		this.sum = kor + eng + math;
	}

	public double getAvg() {
		double per = (double) sum / 3;
		avg = Double.parseDouble(String.format("%.1f", per));
		return avg;
	}

	public void setAvg(double avg) {
		double per = (double) sum / 3;
		this.avg = Double.parseDouble(String.format("%.1f", per));
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void InputStudentInfo() {
		this.sum = kor + eng + math;
		double per = (double) sum / 3;
		this.avg = Double.parseDouble(String.format("%.1f", per));
	}

}
