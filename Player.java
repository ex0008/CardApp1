public class Player {
	String holdingcard;

	void takeCard(Cards c) {
		holdingcard = c.cards[(int)(Math.random() * 53)];
	}

	String getHoldingCard() {
		return holdingcard;
	}
}
