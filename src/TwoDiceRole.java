import java.util.Random;

public class TwoDiceRole {

    public static void main(String[] args) {
        //Random rand1 = new Random( 6) ;
       // Random rand2 = new Random( 6);
        int rand1 = (int)(Math.random()*6) + 1;
        int rand2 = (int)(Math.random()*6) + 1;
        int counter =0;
        int rollTally =0;
        for (int i=0; i<101; i++){
            rand1 = (int)(Math.random()*6) + 1;
            rand2 = (int)(Math.random()*6) + 1;
            //System.out.println(" first random number"  + rand1);
            //System.out.println(" secomd random number" + rand2);
             rollTally = rand1 + rand2 ;

             if(rollTally == 7){
                 counter++;

            }

        }
        System.out.println("print counter is " + counter);

    }
//        System.out.println(" first random number"  + rand1);
//        System.out.println(" secomd random number" + rand2);
}


