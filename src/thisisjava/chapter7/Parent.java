package thisisjava.chapter7;

public class Parent {
	public String nation;
	public String name;
	public int num;
	public Parent() {
//		this("대한민국", "홍길동");
		this("대한민국");
		System.out.println("Basic");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	public Parent(String nation, int num) {
		this.nation = nation;
		this.num = num;
		System.out.println("Parent(String nation, int num) call");
	}

//	public Parent(String nation, String name) {
//		this.name = name;
//		this.nation = nation;
//		System.out.println("Parent(String nation, String name) call");
//	}
}
