package carddeck;

public class Card {
    String number;
    String suit;
    

    public Card(String number, String suit){
        this.number = number;
        this.suit = suit;
        }

    public String toString(){
        return number + " of " + suit;
    }
}
