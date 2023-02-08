/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Random;



public class Card {
    
    private  int suit;   
    private  int value;
    private  int rank;

    public void setSuit(int suit) {
        this.suit = suit;
    }
    

    public void setValue(int value) {
        this.value = value;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Card(int suit, int value, int rank) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;
    }
    
    
    
    
     public Card(Card card) {
        this.suit = card.suit;
        this.value = card.value;
        this.rank = card.rank;
    }

    

   

    public int getSuit() {
       return suit;
    }

    public int getValue() {
        return value;
    }

    public int getRank() {
        return rank;
        
    }
    
}
