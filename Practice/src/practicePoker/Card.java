package practicePoker;

public class Card {
    private String face,suit;
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
        protected String getFace() {
        return face;
    }

    protected String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return suit+face;
    }
}
