/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 *RASAL_KAREEM #991673642
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Add a hard-coded "luckyCard"
        Card luckyCard = new Card();
        luckyCard.setValue(7);  // I chose 7 as the lucky number
        luckyCard.setSuit("Hearts");  // I chose Hearts as the lucky suit

        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() *13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() *4)]);
            magicHand[i] = c;
        }

        // Searching for luckyCard in magicHand
        boolean cardFound = false;
        for (int i = 0; i < magicHand.length; i++) {
            Card currentCard = magicHand[i];
            if (currentCard.getValue() == luckyCard.getValue() && currentCard.getSuit().equals(luckyCard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        if (cardFound) {
            System.out.println("Congratulations! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry! The lucky card is not in the magic hand.");
        }
    }
}