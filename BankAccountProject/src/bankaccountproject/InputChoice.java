/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountproject;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class InputChoice {
    Account acct = new Account();
    public int choose(String choice) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("Please Type: Create account, Delete account, "
                + "Search, or Add funds.");

        choice = stdin.next();

        //Returns -
        //1 = create account
        //2 = delete account
        //3 = search for account
        //4 = add money to account
        //0 = invalid input

        if (choice.equalsIgnoreCase("Create")) {
            System.out.println("do account creation stuff");
            acct.createAcct();
            return 1;
        } else {
            if (choice.equalsIgnoreCase("Delete")) {
                System.out.println("do account deletion stuff");
                return 2;
            }

            if (choice.equalsIgnoreCase("Search")) {
                System.out.println("do account search stuff");
                return 3;
            }

            if (choice.equalsIgnoreCase("Add")) {
                System.out.println("do account add funds stuff");
                return 4;
            } else {
                System.out.println("Invalid input!  Try again.");
                return 0;
            }
        }
        // moreTasks();
    }

    public int moreTasks() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Do you have another task?  (Y/N)");
        String doMore = stdin.next();
        if (doMore.equalsIgnoreCase("y")) {
            return 1;
        } else {
            return 0;
        }
    }
}
