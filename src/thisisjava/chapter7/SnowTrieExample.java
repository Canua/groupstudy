package thisisjava.chapter7;

public class SnowTrieExample {
	public static void main(String[] args) {
		Tire tire = new Tire();
		SnowTire snowtire = new SnowTire();
		Tire tire_snow = new SnowTire();
		Tire basic_tire = snowtire;
		tire.run();
		snowtire.run();
		tire_snow.run();
		basic_tire.run();
	}
}
