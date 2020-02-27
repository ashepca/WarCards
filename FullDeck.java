/** Filename FullDeck.java
* Written by @author Andrew Shepherd
* Written on 19-Mar-2017
* This file describes an array of 52 Card objects 
**/

public class FullDeck
{
    public static void main(String[] args)
    {
        Card[] deck = new Card[52];
        int a, b, c, d, y, x;	

	for(a = 0, y = 1; a < 13; a++, y++)
        {       
            deck[a] = new Card();           
            deck[a].setCardSuit(1);
	    deck[a].setCardValue(y); 
            deck[a].setCardRank(y);
        }

	for(b = 13, y = 1; b < 26; b++, y++)
        {       
            deck[b] = new Card();           
            deck[b].setCardSuit(2);
	    deck[b].setCardValue(y); 
            deck[b].setCardRank(y);
        } 

	for(c = 26, y = 1; c < 39; c++, y++)
        {       
            deck[c] = new Card();           
            deck[c].setCardSuit(3);
	    deck[c].setCardValue(y); 
            deck[c].setCardRank(y);
        } 

	for(d = 39, y = 1; d < 52; d++, y++)
        {       
            deck[d] = new Card();           
            deck[d].setCardSuit(4);
	    deck[d].setCardValue(y); 
            deck[d].setCardRank(y);
        }  

        for(a = 0; a < 52; ++a)        
            System.out.println("Array position [" + a + "] is: " +
                deck[a].getCardRank() + " of " + deck[a].getCardSuit());
    }
}

