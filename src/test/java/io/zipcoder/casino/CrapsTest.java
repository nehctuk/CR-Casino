package io.zipcoder.casino;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrapsTest {
    Craps crapsGame;

    @Before
    public void setUp() throws Exception {
        crapsGame = new Craps();
    }

    @After
    public void tearDown() throws Exception {
        crapsGame = null;
    }

    @Test
    public void takeBet() throws Exception {
        //Can't test uses a Scanner.
    }

    @Test
    public void play() throws Exception {
        //Can't test uses a Scanner.
    }

    @Test
    public void bootPlayer() throws Exception {
        //Prints text and exits. How do I test?
    }

    @Test
    public void playerStillWantsToPlay() throws Exception {
        //Can't test uses a Scanner.
    }

    @Test
    public void printLoseMessage() throws Exception {
    }

    @Test
    public void printLosings() throws Exception {
    }

    @Test
    public void twoThreeOrTwelve() throws Exception {
    }

    @Test
    public void printWinMessage() throws Exception {
    }

    @Test
    public void printWinnings() throws Exception {
    }

    @Test
    public void sevenOrEleven() throws Exception {
    }

    @Test
    public void printDiceRoll() throws Exception {
    }

    @Test
    public void rollBothDice() throws Exception {
    }

    @Test
    public void pressEnterToRoll() throws Exception {
    }

    @Test
    public void printWelcomeMessage() throws Exception {
    }

}