/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Michael
 * @param <T> Account object
 */
//Generic account class
public class Account<T> {

    private String name;
    private int acctNum;
    private float balance;
    public ArrayList<T> accounts = new ArrayList<>();

    
    //prompt for user input for the new account
    public int createAcct() {
        Scanner stdin = new Scanner(System.in);
        String input = stdin.toString();
        String acctName;
        int num = 1000;
        String strBal;
        float bal;
        
        //User input prompts
        System.out.println("Enter Account Name: ");
        acctName = stdin.next();
        System.out.println("Enter starting balance: ");
        strBal = stdin.next();
        //convert balance input string to float
        bal = Float.parseFloat(strBal);
        
        Account<T> newAcct = new Account<>(acctName, num, bal);
        num++;
        accounts.add(newAcct);
        System.out.println("Acct created");
        return 1;
    }

    //default constructor
    Account() {
        name = "null";
    }

    //Setup Account from user input
    Account(String acctName, int num, float bal) {
        name = acctName;
        acctNum = num;
        balance = bal;
           
    }

    //Setter and Getter for attributes
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.acctNum = num;
    }

    public int getNum() {
        return acctNum;
    }

    public void setBalance(float bal) {
        this.balance = bal;
    }

    public float getBalance() {
        return balance;
    }
    
    @Override
    public String toString(){
        return "Account Name: Finish this...";
    }
}
