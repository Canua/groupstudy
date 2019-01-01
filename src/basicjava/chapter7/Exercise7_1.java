package basicjava.chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for (int i = 0; i < cards.length * 2; i++) {
			int x = (int) (Math.random() * cards.length);
			int y = (int) (Math.random() * cards.length);

			SutdaCard tmp = cards[x];
			cards[x] = cards[y];
			cards[y] = tmp;
		}
	}

	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM) // index의 유효성을 검사한다.
			return null;
		return cards[index];
	}

	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return pick(index); // pick(int index)를 호출한다.
	}
}

class SutdaCard {
	final int NUM;
	final boolean IS_KWANG;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}

	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}