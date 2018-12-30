package basicjava.chapter6;

public class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}
class MyPoint {
	static int x;
	static int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	static double getDistance(int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
}
