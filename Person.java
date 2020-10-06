package ScoreCard;

import java.util.Scanner;

public class Person {
    private String Name;
    private Points Score;
    private Scanner scanner;

    public Person(String name, Scanner s) {
        Name = name;
        Score = new Points();
        scanner = s;
    }

    public void GetScore (){

        System.out.printf("%s's score? ", Name);
        var score = scanner.nextInt();
        Score.AddScore(score);
    }
    public void PrintScore(){
        System.out.printf("%s's : %d \n", Name, Score.GetScore() );


    }
}
