package basicjava.chapter7;

class Product {
	int price; // 제품 가격
	int bonusPoint; // 제품구매시 보너스 점수

	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

}

class Tv extends Product {

	public Tv(int price) {
		super(price);
	}

	public String toString() {
		return "Tv";
	}

}

public class Exercise7_5 {
	public static void main(String[] args) {
		Tv tv = new Tv(20000);
		System.out.println(tv.toString() + "제품 가격 : " + tv.price + "  제품 보너스 점수 : " + tv.bonusPoint);

	}
}
