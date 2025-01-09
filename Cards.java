public class Cards {
	String[] cards = new String[52];
	String[] cardmarks = {"Spade", "Diamond", "Heart", "Clover"};

	Cards() {
		for (int i = 0; i < cardmarks.length; i++) {
			for (int j = 0; j < 13; j++) {
				cards[j + (i*13)] = "" + cardmarks[i].charAt(0) + (j + 1);
			}
		}
	}
}
