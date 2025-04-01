package wordlegame;

import java.util.Scanner;

public class Wordle{
    private String secretWord;
    private int attempts;

    public Wordle(String secretWord, int attempts){

        this.secretWord = secretWord;
        this.attempts = attempts;
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while(remainingAttempts > 0){

            System.out.println("Attempt #: " + remainingAttempts);
            System.out.println("Enter Your Guess: ");

           String guessWord = scanner.nextLine();

           if (guessWord.length()!=secretWord.length()){
               System.out.println("Invalid Entry! The word must have " + secretWord.length() + " characters!");
               continue;
           }

           int correctPositions = 0;
           int correctChars = 0;

            for (int i = 0; i < secretWord.length(); i++) {
                char c = guessWord.charAt(i);
                if (c == secretWord.charAt(i)){
                    correctPositions++;
                } else if (secretWord.indexOf(c) >= 0) {
                    correctChars++;
                }
            }

            if (correctPositions == secretWord.length()){
                System.out.println("Congrats! You have guessed the secret word!" + secretWord);
                break;
            }else {
                System.out.println("Correct characters: " + correctChars);
                System.out.println("Correct positions: " + correctPositions);
                remainingAttempts--;
            }
        }
        if (remainingAttempts == 0){
            System.out.println("Sorry, you are out of attempts! The secret word was: " + secretWord);
        }
    }
}