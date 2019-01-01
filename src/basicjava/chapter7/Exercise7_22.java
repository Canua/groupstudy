package basicjava.chapter7;

public class Exercise7_22 {
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i].calcArea();
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rect(3, 4), new Circle(1) };
		System.out.println("면적의 합 : " + sumArea(arr));
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}

}

class Rect extends Shape {
	double width;
	double height;

	Rect(double width, double height) {
		this(new Point(0, 0), width, height);
	}

	Rect(Point p, double width, double height) {
		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다 .
		this.width = width;
		this.height = height;
	}

	boolean isSquare() { // width 나 height 가 0 이 아니고 width 와 height 가 같으면 true 를 반환한다 .
		return width * height != 0 && width == height;
	}

	double calcArea() {
		return width * height;
	}

}

class Circle extends Shape {
	double r;

	Circle(double r) {
		this(new Point(0, 0), r);
	}

	Circle(Point p, double r) {
		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다 .
		this.r = r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

}
