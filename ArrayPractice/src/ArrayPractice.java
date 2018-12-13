
/**
 * Kai'lani Woodard
 * Array Practice
 * Programming II - AP CS
 * 12-10-2018
 */

import java.util.Random;

public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] randomInts = new int[100]; //Create array of 100 random integers

        Random randy = new Random(); //Create random object

        for (int i = 0; i < randomInts.length; i++) { //
            randomInts[i] = randy.nextInt(10) + 1;
        }

        int[] intOccur = new int[10];

        for (int x = 0; x < randomInts.length; x++) {
            switch (numbers[x]){
                case 1:
                    intOccur[1] += 1;
                    break;
                case 2:
                    intOccur[2] += 1;
                    break;
                case 3:
                    intOccur[3] += 1;
                    break;
                case 4:
                    intOccur[4] += 1;
                    break;
                case 5:
                    intOccur[5] += 1;
                    break;
                case 6:
                    intOccur[6] += 1;
                    break;
                case 7:
                    intOccur[7] += 1;
                    break;
                case 8:
                    intOccur[8] += 1;
                    break;
                case 9:
                    intOccur[9] += 1;
                    break;
                case 10:
                    intOccur[10] += 1;
                    break;
                    }
                }
            }
            if (x < 9) {
                System.out.print(intOccur[x] + ", ");
            } else {
                System.out.println(intOccur[x]);
            }
        }
    }

}
