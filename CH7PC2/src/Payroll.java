/**
 * Kai'lani Woodard
 * Payroll 
 * Programming II - AP CS
 * 12-19-2018
 */

public class Payroll {
        //Create input for ID being used
    int idInput;
        //Create array for database of Employee Identification Numbers
    final int[] EMPLOYEEID = {5658845, 4520125, 7895122, 8777541,
                        8451277, 1302850, 7580489};
        //Create arrays for hours, payrate, and wages.
    double[] hours = new double[7];
    double[] payRate = new double[7];
    double[] wages = new double[7];
    
        
        /**Create mutator method for setting ID number
         */
    public void setidInput(int idi) {
        idInput = idi;
    }
    
        /**Create mutator method for setting hours
         */
    public void setHours(int x, double h) {
        hours[x] = h;
    }
    
         /**Create mutator method for setting pay rate
         */
    public void setPayRate(int x, double pr) {
        payRate[x] = pr;
    }
         /**Create mutator method for setting wages
         */
    public void setWages(int x,double w) {
        w = hours[x]*payRate[x];
        wages[x] = w;
    }
        /**Return employee ID array
         */
    public int[] getEMPLOYEEID() {
        return EMPLOYEEID;
    }
    
    
         /**Create accessor method for accessing wages
         */
    public double getWages() {
        int x = -1;
        for(int i = 0; i < 7; i++) {
            if (idInput == EMPLOYEEID[i]) {
                x = i;
                break;
            }
        }
        return wages[x];
    }
}
