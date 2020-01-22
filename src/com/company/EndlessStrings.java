package com.company;

import java.util.Scanner;

public class EndlessStrings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        userInput = keyboard.next(); //get user input

        while (userInput != "stop") {// previous user input starts the loop
            System.out.println(userInput); //print out user input from previous input
            userInput = keyboard.next(); //receives a new input

            if (userInput.equals("stop")) {//'userInput' will go through this check.
                System.out.println("Out of loop");
                break;//end loop if condition is true.
            }
        }
    }
}


