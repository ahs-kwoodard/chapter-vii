/**
 * Kai'lani Woodard
 * Charge Account Validation 
 * Programming II - AP CS
 * 12-8-2018
 */

public class ChargeAccountValidation {
    int accInput; //Inputted account number
    
    public void setAccountNum(int ai) { //Mutator method for setting
        accInput = ai;                  //the account number.
    }
    
    public int getAccountNum() { //Accessor method for accessing the
        return accInput;        // account number.
    }
    
    public int validateAccountNum() {
        //Array with all of the accounts within the database enclosed
        final int[] ACCOUNTS = {5658845, 4510125, 7895122, 8777541, 8451277,
                1302850, 8080152, 4562555, 5552012, 5050552, 7825877,
                1250255, 1005231, 6545231, 3852085, 7576651, 7881200,
                4581002};
        int validAcc = -1; //Value returned indicating account's validity
            for(int i = 0; i < 18; i++) { //For loop iterating for the
                                        // number of potential account numbers
                if(accInput == ACCOUNTS[i]) { //if input matches a number
                    validAcc = 1; //Account is valid
                    break; //break the loop
                } else { //Otherwise
                    validAcc = 0; //Account is invalid
                }
        }
            return validAcc; //Return indicator of validity
    }
}
