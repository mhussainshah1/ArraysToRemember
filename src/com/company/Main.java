package com.company;

import java.util.Scanner;

/**
 * Storing the history of values in a program is a common task. Maintaining an object's history requires the programmer
 * to either write specific code or use a library which supports history logging. Today you're going to write specific
 * code to store the history of a list.
 *
 * Create a program that prompts for 5 words and saves those words to a variable. The program remembers the history of
 * the variable because the variable is an array. Next use a for loop to print the words to the console in the order the
 * user entered them. Print the history whenever the user types the word "History", otherwise save the word that is entered.
 *
 * Type in the names of the last ten presidents in the order they were elected. When you are done, enter the word history.
 * Your program should display their names starting with the most recent.
 *
 * For your convenience, the names of the last 10 presidents are:
 *
 * Kennedy, Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama
 *
 */
public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    //Part 1
        String[] words = new String[5];
        System.out.println("Enter 5 words : ");
        for (int i = 0; i < words.length; i++) {
            words[i] = keyboard.next();
            if (words[i].equalsIgnoreCase("history")){
                print(words, i);
                break;
            }
        }
        print(words, words.length);

        //Part 2
        String[] presidents = new String[10];
        System.out.println("Type in the names of the last ten presidents in the order they were elected.");
        for (int i = 0; i < presidents.length; i++) {
            presidents[i] = keyboard.next();
            if (presidents[i].equalsIgnoreCase("history")){
                print(presidents, i);
                break;
            }
        }
        print(presidents, presidents.length);

    }

    public static void print(String[] words , int length){
        for (int i = 0; i < length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
