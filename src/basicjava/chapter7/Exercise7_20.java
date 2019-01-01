package basicjava.chapter7;

class Exercise7_20 {
	public static void main(String[] args) {
		Parents p = new Childs();
		Childs c = new Childs();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parents {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Childs extends Parents {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}
