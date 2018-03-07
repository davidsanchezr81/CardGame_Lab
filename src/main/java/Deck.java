import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }


    public int countCards() {
        return this.deck.size();
    }

    public void getAllCards() {
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                deck.add(new Card(suit, rank));
    }



    public Card randomCard(){
        Collections.shuffle(this.deck);
        return deck.get(0);

    }
    public void removeCard(Card card) {
        this.deck.remove(card);
    }


}
