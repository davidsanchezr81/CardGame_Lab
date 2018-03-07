import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;
    private int allowance;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.hand = new ArrayList<>();
        this.allowance = 1;

    }

    ;

    public String getName() {
        return name;
    }


    public int countCards() {
        return this.hand.size();
    }



    public void addCard(Card card) {
        if (countCards() < this.allowance) ;
        {
            this.hand.add(card);
        }

    }
}











    //int count = 0;
    // loop over your hand
    //  each card needs to say count+=card.getValue()
    // return count;






//    public int countCards(){
//        return hand.size();
//    }


