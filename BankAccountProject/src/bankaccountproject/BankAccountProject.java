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
public class BankAccountProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a program that establishes a bank account for a person
        //TASKS ----------------
        //What type of data structure to use for accounts?????
        //Open an account --> Person's name, account number, starting money in account
        //Delete an account -->
        //Search for account by name OR number --> same name different acct #'s
        //Add money to an account --> Search for account, add amount desired, return total

        
        Scanner stdin = new Scanner(System.in);
        String input = stdin.toString();
        InputChoice thisChoice = new InputChoice();

        int inpReturn = thisChoice.choose(input);
        //If the user input is illegal try again (But only ONE more time) 
        if (inpReturn == 0) {
            thisChoice.choose(input);
        }
        int i = 1;
        while (i == 1) {
            System.out.println("Do you have another task?  (Y/N)");
            String doMore = stdin.next();
            if (doMore.equalsIgnoreCase("n")) {
                System.out.println("Exiting...");
                System.exit(0);
            }
            goAgain();
        }
        
        //ALL INPUT STUFF WORKING WELL ENOUGH
    }
    //Method for repeating input tasks
    public static void goAgain() {
        Scanner stdin = new Scanner(System.in);
        String input = stdin.toString();
        InputChoice again = new InputChoice();
        again.choose(input);

    }
}
