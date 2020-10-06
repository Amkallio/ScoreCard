package ScoreCard;

import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Scorecard scorecard = new Scorecard (scanner);
        scorecard.SetPeople();
        scorecard.GetScores();
        scanner.close();

        
    }
}
