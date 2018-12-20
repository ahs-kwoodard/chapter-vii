/**
 * Kai'lani Woodard
 * Payroll Runner 
 * Programming II - AP CS
 * 12-19-2018
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class PayrollRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Payroll pr = new Payroll(); //Create new payroll object
        Scanner kb = new Scanner(System.in); //Create new scanner object
        DecimalFormat df = new DecimalFormat("#.00"); //Create new decimal
                                                    // formatting object
        
            //Import Employee Identification Number Database from Payroll Class
        final int[] EMPLOYEEID = pr.getEMPLOYEEID();
        
        double input; //Create input variable 
        
        for (int i = 0; i < 7; i++) { //Repeat 7 times, increasing by 1 each
                                    // iteration, starting at 0.
            pr.setidInput(EMPLOYEEID[i]); //Set ID in question as current ID
                //Prompt user for hours for current Employee ID
            System.out.print("Please input hours for " + EMPLOYEEID[i] + ": ");
            input = kb.nextDouble(); //Store input within "input"
            while (input < 0) { //While input is less than 0
                System.out.println("***********************************");
                    //Inform user of their mistake
                System.out.println("ERROR: Cannot work negative hours.");
                    //Prompt them to input hours again
                System.out.print("Please input hours for " + EMPLOYEEID[i] 
                        + ": ");
                input = kb.nextDouble(); //Store input within "input"
                System.out.println("***********************************");
            }
            pr.setHours(i, input); //Set hours with input
                //Prompt user for pay rate (hourly) for current Employee ID
            System.out.print("Please input pay rate (hourly)"
                    + " for " + EMPLOYEEID[i] + ": $");
            input = kb.nextDouble(); //Store input within "input"
            while (input < 6) { //While input is less than 6
                System.out.println("***********************************");
                    //Inform user of their mistake
                System.out.println("ERROR: Inputted payrate is cruel in "
                        + "this economy.");
                    //Prompt user to input a value >6
                System.out.print("Please input pay rate of $6 or greater for "
                        + EMPLOYEEID[i] + ": $");
                input = kb.nextDouble(); //Store input within "input"
                System.out.println("***********************************");
            }
            pr.setPayRate(i, input); //Set payrate with input
            pr.setWages(i, EMPLOYEEID[i]); //Calculate wages for each employee
            
            System.out.println("");
        }
        
            //Print title
        System.out.println("\n************GROSS WAGES************");
        System.out.println("***********************************");
        
        for (int x = 0; x < 7; x++) { //Repeat 7 times, increasing by 1 each
                                    // iteration, starting at 0.
            System.out.println("ID #: " + EMPLOYEEID[x]); //Print ID number
            pr.setidInput(EMPLOYEEID[x]); //Set ID in question
                //Print gross pay for ID in question
                    //Use decimal format to format pay correctly
            System.out.println("Gross Pay: $" + df.format(pr.getWages()));
            System.out.println("***********************************");
        }
        
    }

}
