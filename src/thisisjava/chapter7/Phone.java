package thisisjava.chapter7;

public abstract class Phone {

	public String owner;
	public boolean on;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		on = true;
		System.out.println(" 폰 전원 On");
	}

	public void turnOff() {
		on = false;
		System.out.println(" 폰 전원 Off");
	}
}
