/**
 * Kai'lani Woodard
 * Charge Account Validation Runner 
 * Programming II - AP CS
 * 12-8-2018
 */

import java.util.Scanner;
public class ChargeAccountValidationRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input; //User input for account
        String inputStr = ""; //String for determining input length
        Scanner kb = new Scanner(System.in); //Create scanner object
            //Create Charge Account Validation object
        ChargeAccountValidation cav = new ChargeAccountValidation();
        
            //Prompt user to input account number
        System.out.print("Please input your account number: ");
        input = kb.nextInt(); //Store input
        cav.setAccountNum(input); //Set account number within CAV class
        
        inputStr += input; //Store input within String
        
        while(inputStr.length() != 7) { //While input isn't 7 characters
                //Inform user that input is invalid
            System.out.println("Invalid amount of characters.\r");
                //Reprompt user to input account number
            System.out.print("Please input your account number: ");
            input = kb.nextInt(); //Store input
            inputStr = ""; //Reset input String
            inputStr += input; //Store input within String to recheck
        }
        
        if(cav.validateAccountNum() == 1) { //If accountNumber is valid
            System.out.println(input + " is in our database!");
        } else if (cav.validateAccountNum() == 0) { //If accNum isn't valid
            System.out.println(input + " is not in our database!");
        }
        
    }
   
}
