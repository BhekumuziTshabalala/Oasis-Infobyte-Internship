package org.train;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    /**
     * This is the main method that drives the game.
     *
     * The game flow is as follows:
     * 1. The user is asked to choose a difficulty level.
     * 2. A number is generated based on the chosen difficulty level.
     * 3. The user is then asked to guess this number within a certain number of attempts.
     * 4. If the user guesses the number correctly, they win the game.
     * 5. The user is asked if they want to play again.
     * 6. Steps 2-5 are repeated until the user decides to stop playing.
     * 7. Finally, the total number of games played and the number of games won by the user are displayed.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {

        String difficulty = getDifficulty();
        int numberToGuess = generateNumber(difficulty);
        int numberOfWins = 0;
        int gamesPlayed = 0;
        do{
            if(playGame(numberToGuess)){
                numberOfWins ++;
            }
            gamesPlayed ++;
        }while (keepPlaying());

        System.out.println("You've won "+ numberOfWins + " out of " + gamesPlayed + " Games");
        in.close();

    }

    /**
     * This method prompts the user to decide whether they want to continue playing the game.
     *
     * The user is asked if they want to play again. They can respond with 'Y' for yes or 'N' for no (case-insensitive).
     * If the user enters 'Y', the method returns true, indicating that the game should continue.
     * If the user enters 'N', the method returns false, indicating that the game should end.
     *
     * @return A boolean value indicating whether the game should continue. Returns true if the user wants to continue playing, and false otherwise.
     */
    public static boolean keepPlaying(){
        while (true){
            System.out.print("Wanna play again Y(yes) or N(no): ");
            String play = in.next();
            if(play.equalsIgnoreCase( "y")){
                return true;
            } else if (play.equalsIgnoreCase( "n")) {
                return false;
            }
        }

    }

    /**
     * This method represents the main game logic. It prompts the user to guess a number within a certain range.
     *
     * The user has 5 attempts to guess the correct number. After each guess, the method gives a hint whether the guess was too high or too low.
     * If the user guesses the correct number within the given attempts, the method returns true. If the user fails to guess the correct number within the given attempts, the method returns false.
     *
     * @param numberToGuess The number that the user has to guess. This number is generated based on the difficulty level chosen by the user.
     * @return A boolean value indicating whether the user has guessed the correct number within the given attempts. Returns true if the user guesses the correct number, and false otherwise.
     */
    public static boolean playGame(int numberToGuess){
        int numberOfGuesses = 5;
        int guess = 0;

        while (numberOfGuesses != 0){
            try {
                System.out.print("Enter your Guess [Guesses left "+ numberOfGuesses +"] : ");
                guess = in.nextInt();

            }catch (Exception e){
                System.out.println("Please enter a NUMBER!!");
                continue;
            }

            if(guess > numberToGuess)
                System.out.println("Too High");
            else if (guess < numberToGuess)
                System.out.println("Too Low");
            else{
                System.out.println("Good job !!!");
                return true;
            }
            numberOfGuesses --;
        }
        return false;

    }



    /**
     * This method generates a random number based on the specified difficulty level.
     *
     * @param difficulty The difficulty level of the game. It can be "easy", "medium", or any other string.
     *                   If the difficulty is "easy", the method generates a number between 0 and 20.
     *                   If the difficulty is "medium", the method generates a number between 0 and 50.
     *                   For any other string, the method generates a number between 0 and 100.
     * @return A random integer between 'min' and 'max', inclusive.
     */
    public static int generateNumber(String difficulty){
        Random random = new Random();
        int min = 0;
        int max = switch (difficulty) {
            case ("easy") -> 20;
            case ("medium") -> 50;
            default -> 100;
        };

        return random.nextInt((max - min) + 1) + min;

    }

    /**
     * This method prompts the user to enter the difficulty level for a game.
     *
     * The user is repeatedly asked to enter a difficulty level until they provide a valid input.
     * Valid inputs are "easy", "medium", or "hard" (case-insensitive).
     *
     * @return The difficulty level entered by the user. This will be one of "easy", "medium", or "hard".
     */
    public static String getDifficulty(){

        String difficulty = "";
        do {
            System.out.print("Enter level of difficulty easy,medium or hard :");
            difficulty = in.next();
        }while (!List.of("easy","medium","hard").contains(difficulty.toLowerCase()));

        return  difficulty;
    }
}