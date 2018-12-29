package thisisjava.chapter7;

public class SmartPhone extends Phone {
	public boolean on;

	public SmartPhone(String owner, boolean on) {
		super(owner);
		this.on = on;
	}

	public void internetSearch() {
		System.out.println("인터넷 검색");
	}

	public void brr() {
		System.out.println("brrrr");
	}
}
