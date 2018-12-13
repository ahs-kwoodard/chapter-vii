/**
 * Kai'lani Woodard
 * Sequential Search - Arrays
 * AP CS / Programming III
 * 12-13-2018
*/

import java.util.Scanner;
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input; //Input when prompted "Enter a student from APCS: "
        boolean inClass = false; //Is the inputted student in the class?
        int studentAmt = 7; //Amount of students in APCS
        
        final String[] APCS = {"Michael", "Denver", "Kai'lani", "Owen",
        "Richard", "Lucas", "Dylan"}; //Array of students in APCS
        
        Scanner kb = new Scanner(System.in); //Create scanner object
        
        System.out.print("Enter a student from AP CS: "); //Prompt for input
        input = kb.nextLine(); //Store input
        
        while (true) { //While true (continuous loop)
            for(int i = 0; i < studentAmt; i++) {
                    //Repeat for the amount of students in the class
                if(input.equalsIgnoreCase(APCS[i])) {
                        //If input matches a student in the array
                    inClass = true; //Boolean indicating student is in class
                    break; //Break loop
                }
            }
            
            if(inClass == true) { //If input is in the class
                System.out.println(input + " is in the class!");
                    //Inputted student is in the class!
                break; //Break loop
            } else if (input.equalsIgnoreCase("Mr. Mulroy") ||
                        input.equalsIgnoreCase("Mulroy") ||
                        input.equalsIgnoreCase("Patrick Mulroy") ||
                        input.equalsIgnoreCase("Patrick") ||
                        input.equalsIgnoreCase("Pat")) {
                            //Bonus scenario if Mr. Mulroy entered
                System.out.println(input + " is the teacher!");
                    //Indicated Mr. Mulroy is the teacher
                System.out.print("Please enter a STUDENT in APCS: ");
                    //Prompt for STUDENT in APCS
                input = kb.nextLine(); //Store input
            } else if (inClass == false) { //If input is not in the class!
                System.out.println(input + " is not in the class!");
                    //Inputted student is not in the class!
                System.out.print("Please enter a student in APCS: ");
                    //Prompt for student in APCS
                input = kb.nextLine(); //Store input
            }
        }
    
    }
    
}
