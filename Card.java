package assignment4;
public class Card implements Comparable<Card> {
    public static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King"};
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return ranks[rank - 1] + " of " + suit;
    }

    @Override
    public int compareTo(Card otherCard) {
        // Compare cards based on rank first, then suit
        if (this.rank != otherCard.rank) {
            return Integer.compare(this.rank, otherCard.rank);
        } else {
            return this.suit.compareTo(otherCard.suit);
        }
    }
}