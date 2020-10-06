package ScoreCard;

import java.util.Scanner;

public class Scorecard {
    private Person[] People;
    private Scanner scanner;

    public Scorecard(Scanner s) {
        scanner = s;
    }

    public void SetPeople() {
        while (true) {

            System.out.println("Print A name here.");

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                return;
            }

            addPerson(name);
        }

    }

    private void addPerson(String name) {
        Person person = new Person(name, scanner);
        Person[] people;
        if (People == null) {
            people = new Person[1];
        } else {
            people = new Person[People.length + 1];
        }

        for (var i = 0; i < people.length - 1; i++) {
            people[i] = People[i];
        }
        people[people.length - 1] = person;
        People = people;
    }

    public void GetScores() {
        while (true) {
            for (var i = 0; i < People.length; i++) {
                People[i].GetScore();

            }
            for (var i = 0; i < People.length; i++) {
                People[i].PrintScore();
            }
        }
    }

}
