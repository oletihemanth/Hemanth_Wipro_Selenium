//Card Suit & Rank
//Redesign a Card class using two enums: Suit (CLUBS, DIAMONDS, HEARTS, SPADES) and Rank (ACE…KING).
//Then implement a Deck class to:
//•	Create all 52 cards.
//•	Shuffle and print the order.

package day6_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}
enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
    NINE, TEN, JACK, QUEEN, KING
}
class Card {
    private final Suit suit;
    private final Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private final List<Card> cards = new ArrayList<>();

    Deck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new Card(s, r));
            }
        }
    }
    void shuffle() {
        Collections.shuffle(cards);
    }

    void printDeck() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
}
public class question8 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Original Deck:");
        deck.printDeck();

        deck.shuffle();
        System.out.println("\nShuffled Deck:");
        deck.printDeck();
    }
}

//FIVE of DIAMONDS
//QUEEN of DIAMONDS
//ACE of DIAMONDS
//NINE of HEARTS
//KING of SPADES
//KING of HEARTS
//EIGHT of HEARTS
//FOUR of CLUBS
//TWO of CLUBS
//SEVEN of DIAMONDS
