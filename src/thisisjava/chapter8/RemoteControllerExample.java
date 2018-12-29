package thisisjava.chapter8;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.setMute(false);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
