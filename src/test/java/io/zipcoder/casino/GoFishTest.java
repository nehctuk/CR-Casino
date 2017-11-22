package io.zipcoder.casino;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GoFishTest {
    @Test
    public void checkForPairOf4Test() throws Exception {
        GoFish aGoFishGame = new GoFish();
        Player aPlayer = new Player("Andrew");
        aGoFishGame.setCurrentPlayer(aPlayer);
        //PlayerWarehouse.setCurrentPlayer(aPlayer);
        Card cardOne = new Card(Suit.DIAMONDS, 10, Card.suitSymbols[1], "A");
        Card cardTwo = new Card(Suit.CLUBS, 9, Card.suitSymbols[2], "9");
        Card cardThree = new Card(Suit.HEARTS, 10, Card.suitSymbols[0], "J");
        Card cardFour = new Card(Suit.HEARTS, 10, Card.suitSymbols[0], "A");
        Card cardFive = new Card(Suit.SPADES, 10, Card.suitSymbols[3], "A");
        Card cardSix = new Card(Suit.CLUBS, 10, Card.suitSymbols[2], "A");

        aPlayer.addToHand(cardOne);
        aPlayer.addToHand(cardTwo);
        aPlayer.addToHand(cardThree);
        aPlayer.addToHand(cardFour);
        aPlayer.addToHand(cardFive);
        aPlayer.addToHand(cardSix);

        aGoFishGame.displayHand(aPlayer);

        int expected = 16;
        aGoFishGame.checkForPairOf4(aPlayer);

        aGoFishGame.displayHand(aPlayer);
    }

    @Test
    public void checkForCardInHandTest() {



    }

    @Test
    public void returnFaceValue() {

    }

}