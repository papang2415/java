package newgame;

import java.util.Scanner;

public class Game {

    public int life = 5;

    Scanner input = new Scanner(System.in);

    public String[] names = {"joshua", "james", "kaith", "jeselle", "mary mae", "jolly", "angelica"};
    public String[] hint = {"Shy Guy", "Gwapo", "Cute", "Bright","Boss", "Yes PAPA", "Putot"};

    public int generateRandom() {
        int len = hint.length;
        return len;
    }

    public void displayCurrentWord(String word, boolean[] guessList) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print((guessList[i] ? word.charAt(i) : "_") + " ");
        }
        System.out.println(" ");
    }

    public boolean checkGuess(String word, boolean[] guessList, char guess) {
        boolean checkResult = false;
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                guessList[i] = checkResult = true;
            }
        }
        return checkResult;
    }

    public char guess() {
        String temp;

        System.out.print("Enter You guess: ");
        temp = input.nextLine().toLowerCase();

        return temp.charAt(0);
    }

}
