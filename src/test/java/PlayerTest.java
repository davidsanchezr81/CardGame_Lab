import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("John", 10);
        card = new Card(Suit.HEARTS, Rank.TEN);
    }

    @Test
    public void playerHasName(){
        assertEquals("John", player.getName());
    }


    @Test
    public void playerAddCard(){
        for(int i=0; i<1; i++) {
        player.addCard(card);}
        assertEquals(1, player.countCards());
    }



}
