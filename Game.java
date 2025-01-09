public class Game {
	Player p;
	Cards c;

	Game() {
		p = new Player();
		c = new Cards();
	}

	void start() {
		p.takeCard(c);
	}

	void judge() {
		String pcard = p.getHoldingCard();
		char pcardmark = pcard.charAt(0);
		int pcardnum = Integer.parseInt(pcard.substring(1));

		if (pcardnum >= 10) {
			System.out.println(pcard + " is higher or same to 10!");
			System.out.println("YOU WIN!");
		}
		else {
			System.out.println(pcard + " is lower than 10...");
			System.out.println("YOU LOSE");
		}
	}
}
