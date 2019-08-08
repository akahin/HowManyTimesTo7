import java.util.Scanner;

public class TwoDiceRoleBonus {

    //import java.util.Random;
    //import java.util.Scanner;


    public static void main(String[] args) {
        //Random rand1 = new Random( 6) ;
        // Random rand2 = new Random( 6);
       // initializing to zero
        int rand1     = 0; //
        int rand2     = 0;
        int counter   = 0;
        int counter2  = 0;
        int rollTally = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of  dice rolls");
        int userInput = scan.nextInt();

        for (int i = 0; i < userInput; i++) {
            rand1 = (int) (Math.random() * 6) + 1;
            rand2 = (int) (Math.random() * 6) + 1;
            //System.out.println(" first random number"  + rand1);
            //System.out.println(" secomd random number" + rand2);
            rollTally = rand1 + rand2;

            if (rollTally == 7) {
                counter++;
            } else if (rollTally >= 2 && rollTally <= 12) {
                counter2++;
                // System.out.println(rollTally);
            }

        }


        System.out.println("number of times to roll 7 is " + counter);
        System.out.println("number of times to roll 2-12 is " + counter2);

    }
}

//        System.out.println(" first random number"  + rand1);
//        System.out.println(" secomd random number" + rand2);
//}
//        	Prompt the user for the number of times to roll the dice.
//        1.	Keep track of and display this information for all numbers
//            that can be rolled (2–12).
//
