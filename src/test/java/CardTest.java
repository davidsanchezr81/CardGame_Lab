import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.TEN);

    }

    @Test
    public void cardGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void cardGetRank(){
        assertEquals(Rank.TEN, card.getRank());
    }

    @Test
    public void getValue(){
        assertEquals(10, card.getValue());
    }
    }


