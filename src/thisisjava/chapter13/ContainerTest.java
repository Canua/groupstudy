package thisisjava.chapter13;

public class ContainerTest {
	public static void main(String[] args) {
		ContainerEx<String> container1 = new ContainerEx<String>();
		container1.set("홍길동");
		String str = container1.get();

		ContainerEx<Integer> container2 = new ContainerEx<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
