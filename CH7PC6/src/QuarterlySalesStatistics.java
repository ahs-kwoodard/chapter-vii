
/**
 * Kai'lani Woodard
 * Quarterly Sales Statistics
 * Programming III - AP CS
 * 1-7-2019
 */
import java.util.Scanner;

public class QuarterlySalesStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] sales = new double[6][4];

        //Requirements
        //List of all sales figures by division
        //Total sales for the quarter
        //Average sales for all divisions that quarter
        //The division with the highest sales that quarter
        
        Scanner kb = new Scanner(System.in);

        //Prompt user for sales figures per division
        for (int div = 0; div < sales.length; div++) {
            System.out.println("The following input prompts you for Division "
                    + (div + 1) + ". Please input the following accordingly.");
            for (int x = 0; x < sales[0].length; x++) {
                System.out.print("Please enter quarterly sales figures "
                        + "for Quarter " + (x + 1) + ": $");
                sales[div][x] = kb.nextDouble(); //Assign input to specific
                                                //coordinate within array
            }
        }

        System.out.println(""); //Header for all sales figures by division
        System.out.println("\t\tALL SALES FIGURES BY DIVISION");
        System.out.println("\t\t*****************************");

        //Print out all sales figures by division
        for (int div = 0; div < sales.length; div++) {
            System.out.println("");
            System.out.println("\rDivision " + (div + 1) + "\t");
            for (int x = 0; x < sales[0].length; x++) {
                System.out.println("\tQ" + (x + 1) + "\t" + sales[div][x]);
            }
        }

        System.out.println(""); //Header for total sales per quarter
        System.out.println("\t\tTOTAL SALES PER QUARTER");
        System.out.println("\t\t***********************");

        double quarterTotal; //Variable for quarter total

        //Print out total sales per quarter
        for (int q = 0; q < sales[0].length; q++) {
            quarterTotal = 0;
            System.out.println("");
            System.out.print("\rQ" + (q + 1));
            for (int x = 0; x < sales.length; x++) {
                quarterTotal += sales[x][q];
            }
            System.out.print("\t" + quarterTotal);
        }

        System.out.println(""); //Header for average sales amoung divisions
                                //per quarter
        System.out.println("\t\tAVERAGE SALES AMONG DIVISIONS PER QUARTER");
        System.out.println("\t\t*****************************************");

        double averageSales; //Variable for average sales

        //Print out average sales
        for (int avg = 0; avg < sales[0].length; avg++) {
            averageSales = 0;
            System.out.println("");
            System.out.println("Q" + (avg + 1) + " Average");
            for (int x = 0; x < sales.length; x++) {
                averageSales += sales[x][avg];
            }
            averageSales /= sales.length;
            System.out.print("\t" + averageSales);
        }

        System.out.println(""); //Header for divisions with highest salews
                                //per quarter
        System.out.println("\t\tDIVISIONS WITH HIGHEST SALES PER QUARTER");
        System.out.println("\t\t****************************************");

        double q1High, q2High, q3High, q4High; //Variables for storing
                                                //quarterly high
        int divNum1=0, divNum2=0, divNum3=0, divNum4=0; //Division number
                                                        //for quarterly high
                                                        
        //Set 
        for (int high = 0; high < sales.length; high++) {
            for (int x = 0; x < sales[0].length; x++) {
                if (x > 0 && (sales[high][x] > sales[high - 1][x - 1])) {
                    switch (high) {
                        case 0:
                            q1High = sales[high][x];
                            divNum1 = high;
                            break;
                        case 1:
                            q2High = sales[high][x];
                            divNum2 = high;
                            break;
                        case 2:
                            q3High = sales[high][x];
                            divNum3 = high;
                            break;
                        case 3:
                            q4High = sales[high][x];
                            divNum4 = high;
                            break;
                    }
                }
            }
            
            System.out.println("Q1 \t Divsion " + divNum1);
            System.out.println("Q2 \t Divsion " + divNum2);
            System.out.println("Q3 \t Division " + divNum3);
            System.out.println("Q4 \t Divsion " + divNum4);
            
        }

    }
}
