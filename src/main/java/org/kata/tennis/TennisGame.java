package org.kata.tennis;

import java.util.Map;

public class TennisGame {
    private int scoreOne, scoreTwo;

    Map<Integer, String> scoring = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty",
            4, "Advantage",
            5, "Win"
    );


    public String getScore() {
        String p1Score = scoring.get(scoreOne);
        String p2Score = scoring.get(scoreTwo);

        if(p1Score.equals("Forty") && p2Score.equals("Forty")){
            return "Deuce";
        } else if(p1Score.equals("Advantage") && p2Score.equals("Forty")){
            return "Advantage Player 1";
        } else if(p2Score.equals("Advantage") && p1Score.equals("Forty")){
            return "Advantage Player 2";
        } else if(p1Score.equals("Win") || (p1Score.equals("Advantage") && !p2Score.equals("Advantage"))){
            return "Player 1 wins";
        } else if(p2Score.equals("Win") || (!p1Score.equals("Advantage") && p2Score.equals("Advantage"))) {
            return "Player 2 wins";
        }

        return p1Score + "-" + p2Score;
    }

    public void playerOneScores() {
        scoreOne++;
        if(scoreOne == 4 && scoreTwo == 4){
            scoreOne--;
            scoreTwo--;
        }
    }

    public void playerTwoScores() {
        scoreTwo++;
        if(scoreOne == 4 && scoreTwo == 4){
            scoreOne--;
            scoreTwo--;
        }
    }
}
