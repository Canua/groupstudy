package thisisjava.chapter8;

public class SmartTelevision implements Searchable, RemoteControl {
	private int volume;

	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	public void SetVolume(int volume) {
		if (volume > RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}

	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
