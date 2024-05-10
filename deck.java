package assignment4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class deck {
    private Vector<Card> deck;
    public void createDeck()
    {
        Scanner input = new Scanner(System.in);
        deck = new Vector<Card>(52);
        // populate the deck with cards
        for (int rank = 1; rank <= 13; rank++) {
            for (String suit : Card.suits) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
// display the menu
while (true) {
        System.out.println("***************************\n");
        System.out.println("1. Display the deck of cards");
        System.out.println("2. Shuffle the deck of cards");
        System.out.println("3. Draw a card from the deck");
        System.out.println("4. Empty the deck");
        System.out.println("5. Print a card from the deck");
        System.out.println("6. Compare two cards");
        System.out.println("7. Check if two cards are same");
        System.out.println("8. Find card by rank and suit");
        System.out.println("9. Deal a hand of cards");
        System.out.println("10. Sort the deck of cards");
        System.out.println("11. Quit");
        // get user choice
        System.out.print("Enter your choice (1-11): ");
        int choice = input.nextInt();
        System.out.println("***************************\n");
// handle user choice
 switch (choice) {
        case 1:
            displayDeck();
            break;
        case 2:
            shuffleDeck();
            break;
        case 3:
            drawCard();
            break;
        case 4:
            emptyDeck();
            break;
        case 5:
            printCard();
            break;
        case 6:
            compareCard();
            break;
        case 7:
            sameCard();
            break;
        case 8:
            findCard();
            break;
        case 9:
            dealCard();
            break;
        case 10:
            sortDeck();
            break;
        case 11:
            System.out.println("Goodbye!");
            System.exit(0);
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
}
}
void displayDeck() {
        System.out.println("Deck of cards:");
        for (Card card : deck)
        {System.out.println(card); }
}
void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
        System.out.println("Shuffled deck:");
        for (Card card : deck) {
        System.out.println(card); }
}
void drawCard()
{
// Implement drawing a card
    if (!deck.isEmpty())
    {
        Card drawnCard = deck.removeFirst(); // Draw the first card from the deck
        System.out.println("Card drawn: " + drawnCard);
    }
    else
    {
        System.out.println("No cards left in the deck.");
    }
    }
void emptyDeck() {
// Implement emptying the deck
deck.clear();
System.out.println("Deck is empty.");
}
void printCard()
{
    if (!deck.isEmpty()) {
        System.out.println("Top card of the deck: " + deck.getFirst());
    }
    else
    {
        System.out.println("No cards left in the deck.");
    }
    }
void compareCard() {
    if (deck.size() >= 2) {
        Card firstCard = deck.get(0);
        Card secondCard = deck.get(1);
        if (firstCard.equals(secondCard)) {
            System.out.println("The two cards are the same."); } else {
            System.out.println("The two cards are different."); }
    } else {
        System.out.println("Not enough cards in the deck to compare.");
    } }
void sameCard() {
    Scanner input = new Scanner(System.in);
// Prompt the user to enter the ranks and suits of two cards
    System.out.println("Enter the rank of the first card: ");
    int rank1 = input.nextInt();
    System.out.println("Enter the suit of the first card: "); String suit1 = input.next();
    System.out.println("Enter the rank of the second card: "); int rank2 = input.nextInt();
    System.out.println("Enter the suit of the second card: "); String suit2 = input.next();
// Create instances of Card for the two cards
    Card card1 = new Card(rank1, suit1);
    Card card2 = new Card(rank2, suit2);
    // Compare the two cards
    if (card1.equals(card2)) {
    System.out.println("The two cards are the same.");
    }
    else
    {
        System.out.println("The two cards are not the same.");
    }
}
void findCard() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rank of the card (1-13): ");
    int rank = scanner.nextInt();
    scanner.nextLine(); // Consume newline character
    System.out.print("Enter the suit of the card (Spades, Hearts, Diamonds, Clubs): ");
    String suit = scanner.nextLine().trim(); // Read the suit as a string and remove leading/trailing spaces
    Card searchedCard = new Card(rank, suit);
    int index = deck.indexOf(searchedCard);
    if (index != -1) {
        System.out.println("Card found at index " + index + ": " + deck.get(index)); }
    else {
        System.out.println("Card not found in the deck."); }
}
void dealCard() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of cards to deal: "); int numCardsToDeal = scanner.nextInt(); scanner.nextLine(); // Consume newline character
    if (numCardsToDeal > deck.size()) { System.out.println("Not enough cards in the deck."); return;
    }
    System.out.println("Hand of cards dealt:"); for (int i = 0; i < numCardsToDeal; i++) {
        System.out.println(deck.get(i)); }
}
void sortDeck() {
    deck.sort(null);
    System.out.println("Deck sorted.");
    }
}
