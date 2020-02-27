/** Filename Card.java
* Written by @author Andrew Shepherd
* Written on 19-Mar-2017
* This file describes a card object 
**/

public class Card
{
    private String cardSuit; 
    private int cardValue;	
    public String cardRank;

    /** The setCardSuit method
    * @return void
    * @param suit
    * This method sets the card suit
    **/ 	
    public void setCardSuit(int suit)
    {
        switch(suit)
        {
            case 1:
                cardSuit = "Spades";
                break;
            case 2:
                cardSuit = "Hearts";
                break;
            case 3:
                cardSuit = "Diamonds";
                break;
            case 4:
                cardSuit = "Clubs";
                break;
         }        	
    }

    /** The getCardSuit method
    * @return cardSuit
    * This method returns the card suit
    **/     
    public String getCardSuit()
    {
        return cardSuit;
    }

    /** The setCardValue method
    * @return void
    * @param value
    * This method sets the card value
    **/     				
    public void setCardValue(int value)
    {
        cardValue = value;     
    }

    /** The getCardValue method
    * @return cardValue
    * This method returns the card value
    **/     
    public int getCardValue()
    {
        return cardValue;
    }	

    /** The setCardRank method
    * @return void
    * @param rank
    * This method sets the card rank
    **/ 
    public void setCardRank(int value)
    {
        switch(value)
        {
            case 1:
                cardRank = "Ace";
                break;
            case 2:
                cardRank = "Two";
                break;
            case 3:
                cardRank = "Three";
                break;
            case 4:
                cardRank = "Four";
                break;
            case 5:
                cardRank = "Five";
                break;
            case 6:
                cardRank = "Six";
                break;
            case 7:
                cardRank = "Seven";
                break;
            case 8:
                cardRank = "Eight";
                break;
            case 9:
                cardRank = "Nine";
                break;
            case 10:
                cardRank = "Ten";
                break;
            case 11:
                cardRank = "Jack";
                break;
            case 12:
                cardRank = "Queen";
                break;
            case 13:
                cardRank = "King";
                break;
        }
    }      

    /** The getCardRank method
    * @return cardRank
    * This method returns the card rank
    **/     
    public String getCardRank()
    {
        return cardRank;
    }
	
}