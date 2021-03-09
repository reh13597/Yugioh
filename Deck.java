import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private ArrayList<Card> extraCards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        this.extraCards = null;
        this.shuffleDeck();
    }

    public Deck(ArrayList<Card> cards, ArrayList<Card> extraCards) {
        this.cards = cards;
        this.extraCards = extraCards;
        this.shuffleDeck();
    }

    public Card drawCard() {
        return cards.remove(0);
    }

    public ArrayList<Card> drawFullHand() {
        ArrayList<Card> tempCards;

        for (int i = 0; i < 4; i++) {
            tempCards = cards;
            tempCards.add(cards.remove(0));
        }
        return this.cards;
    }

    public void addCardToDeck(Card c) {
        this.cards.add(c);
        this.shuffleDeck();
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }
}
