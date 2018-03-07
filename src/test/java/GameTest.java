import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player;
    Player player1;
    Player player2;
    Game game;

    Deck deck;
    Card card;

    @Before

    public void before() {
        player = new Player("KFC Commander", 10);
        player1 = new Player("Finn", 20);
        player2 = new Player("Arthur", 19);
        game = new Game(player1, player2);
        deck = new Deck();
        deck.getAllCards();
    }

    @Test
    public void deckHave52Cards() {
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canRemoveCard(){
        player.addCard(card);
        assertEquals(1, player.countCards());
        deck.removeCard(card);
        assertEquals(51, deck.countCards());

    }
}
