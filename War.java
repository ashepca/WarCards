/** Filename War.java
* Written by @author Andrew Shepherd
* Written on 19-Mar-2017
* This program randomly selects two playing cards and compares the values, until 52 cards are used 
**/

import java.util.*;
public class War
{
    public static void main(String[] args)
    {
	System.out.println("\nComputer Player\t\tHuman Player\t\tResult\n");        
	War playerCards = new War();
    }

    public War()
    {
        Card[] deck = new Card[52];
        int a, b, c, d, y, z;	
	int winsComputer = 0;
	int winsHuman = 0;
        int ties = 0;
	String result;

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

	for(z = 0; z < 26; z++)
        {
	    int deckPosition1 = ((int)(Math.random() * 100) % 51 + 1);
	    String oneRank = deck[deckPosition1].getCardRank();
	    String oneSuit = deck[deckPosition1].getCardSuit();
	    int oneValue = deck[deckPosition1].getCardValue();

	    int deckPosition2 = ((int)(Math.random() * 100) % 51 + 1);
	    String twoRank = deck[deckPosition2].getCardRank();
	    String twoSuit = deck[deckPosition2].getCardSuit();
	    int twoValue = deck[deckPosition2].getCardValue();

            if(oneValue > twoValue)
            { 
                result = "Computer Wins";
                winsComputer = winsComputer + 1;
            }
            else
               if(oneValue < twoValue)
               {               
                   result = "Human Wins";
                   winsHuman = winsHuman + 1;
               }
               else
               {              
                   result = "Tie";
                   ties = ties + 1;
               }		

            System.out.println(oneRank + " of " + oneSuit + "\t\t" +
                twoRank + " of " + twoSuit + "\t\t" + result);
        }

	System.out.println("\nRounds Computer won: " + winsComputer +
 	    "\nRounds Human won: " + winsHuman +
            "\nTimes it was a tie: " + ties);
    }	
}
	