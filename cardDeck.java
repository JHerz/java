package carddeck;

 import java.util.ArrayList;

public class CardDeck {
    static ArrayList <Card> Deck = new ArrayList <Card>();
   
    public static void main(String[] args) {
        
        String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String cardNumbers[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};
        
        for(int number = 0;  number<=12; number++){
            for (int SuitNumber = 0; SuitNumber <=3; SuitNumber++){
                Card card = new Card(cardNumbers[number], suits[SuitNumber]);
                Deck.add(card);
                }
            }
    
        for (Card card : Deck){
            System.out.println(card);
            }
    }
    
}