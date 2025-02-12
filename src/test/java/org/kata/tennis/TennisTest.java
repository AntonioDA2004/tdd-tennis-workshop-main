package org.kata.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TennisTest {

    @Test
    void shouldReturnLoveLove_OnStart() {
        TennisGame game = new TennisGame();

        String score = game.getScore();

        assertEquals("Love-Love", score);
    }

    @Test
    void testPlayerOneScoresOnce_ShouldBeFifteenLove() {
        TennisGame game = new TennisGame();

        game.playerOneScores();

        String score = game.getScore();

        assertEquals("Fifteen-Love", score);
    }

    @Test
    void testPlayerTwoScoresOnce_ShouldBeLoveFifteen() {
        TennisGame game = new TennisGame();

        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Love-Fifteen", score);
    }

    @Test
    void testBothPlayersScoreOnce_ShouldBeFifteenAll() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Fifteen-Fifteen", score);
    }

    @Test
    void testPlayerOneScoresTwice_ShouldBeThirtyLove() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();

        String score = game.getScore();

        assertEquals("Thirty-Love", score);
    }

    @Test
    void testPlayerTwoScoresTwice_ShouldBeLoveThirty() {
        TennisGame game = new TennisGame();

        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Love-Thirty", score);
    }

    @Test
    void testScoreIsFortyAll_ShouldBeDeuce() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Deuce", score);
    }

    @Test
    void testPlayerOneAdvantageAfterDeuce_ShouldBeAdvantagePlayerOne() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Advantage Player 1", score);
    }

    @Test
    void testPlayerTwoAdvantageAfterDeuce_ShouldBeAdvantagePlayerTwo() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Advantage Player 2", score);
    }

    @Test
    void testPlayerOneWinsAfterAdvantage_ShouldBeWinPlayerOne() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Player 1 wins", score);
    }

    @Test
    void testPlayerTwoWinsAfterAdvantage_ShouldBeWinPlayerTwo() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Player 2 wins", score);
    }

    @Test
    void testAdvantageLost_BackToDeuce() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Deuce", score);
    }

    @Test
    void testPlayerOneWinsByTwoPoints_ShouldBeWinPlayerOne() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Player 1 wins", score);
    }

    @Test
    void testPlayerTwoWinsByTwoPoints_ShouldBeWinPlayerTwo() {
        TennisGame game = new TennisGame();

        game.playerOneScores();
        game.playerOneScores();

        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();
        game.playerTwoScores();

        String score = game.getScore();

        assertEquals("Player 2 wins", score);
    }
}