package thisisjava.chapter7;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("홍길동", false);
		smartphone.turnOn();
		smartphone.brr();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
