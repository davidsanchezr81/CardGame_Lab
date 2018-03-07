import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Player player;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.HEARTS, Rank.TEN);
        player = new Player("Ronald Mcdonald", 10);
    }

    @Test
    public void getDeckSize(){
        deck.getAllCards();
        Card card1 = deck.randomCard();
        player.addCard(card1);
        deck.removeCard(card1);
        assertEquals(51, deck.countCards());
    }
}

