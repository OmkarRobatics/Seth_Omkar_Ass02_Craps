import java.util.Random;
import java.util.Scanner;

public class Ass_02_Craps {
    public static void main(String[] args) {
        // var declarations
        String playAgain = ""; // var to store yes or no
        Scanner in = new Scanner(System.in); // sets up scanner
        boolean done = false;
        boolean range = true;
        boolean match = false;
        
        do {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1; // generates random number from 1 to 6
            int die2 = rnd.nextInt(6) + 1; // generates random number from 1 to 6
            int crapsRoll = die1 + die2; // the number you roll is equal to the sum of both rolls
            int point = 0; // var to store point

            if (crapsRoll == 7 || crapsRoll == 11) // testing for natural
            {
                System.out.println("Your first roll was a " + die1 + " and your second was a " + die2 + "." + " The sum is " + crapsRoll + "." + " You won by rolling a natural!"); // outputs if natural is rolled
            }
            else if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) // testing for crap out
            {
                System.out.println("Your first roll was a " + die1 + " and your second was a " + die2 + "." +  " You rolled a crap out, " + crapsRoll + "." + " You lose."); // outputs if a crap out is rolled
            }
            else // roll is a 4,5,6,8,9,10
            {
                System.out.println("Your first roll was a " + die1 + " and your second was a " + die2 + "." +  " The sum is " + crapsRoll + "." + " This is kept as a point."); // outputs
                point = crapsRoll; // stores the roll as a point
            }
            
            if (point == crapsRoll) // tests if there is a point
            {
                do {
                    rnd = new Random(); // generates two more random numbers from 1 to 6
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die2 + die1; // adds the numbers to determine the craps roll.

                    if (crapsRoll == point) // tests if point is matched
                    {
                        System.out.println("Your first roll was a " + die1 + " and your second was a " + die2 + "." + " You matched the point by rolling a " + crapsRoll + "!" + " You win!"); // outputs if test is passed
                        match = true;
                    }
                    else if (crapsRoll == 7) // tests if 7 is rolled
                    {
                        System.out.println("Your first roll was a " + die1 + " and your second was a " + die2 + "." + " You lost because the sum is 7."); // outputs if test is passed
                        match = true;
                    }
                    else // the roll is not matched to the point or is not a 7
                    {
                        System.out.println("Your first roll was a " + die1 + " and your second was a " + die2 + "." + " The sum is " + crapsRoll + "." + " Keep rolling"); // outputs
                        match = false;
                    }
                } while (match == false); // repeats until the roll is 7 or matches the point
            }
         do
        {
            System.out.print("Would you like to play again? Respond with Y for yes and N for no: "); // prompts user to play again
            playAgain = in.nextLine(); // stores input
            if(playAgain.equalsIgnoreCase("y")) // tests if user responds with yes
            {
                done = true;
                range = true;
            }
            else if (playAgain.equalsIgnoreCase("n")) // tests if user responds with no
            {
                done = false;
                range = true;
            }
            else // user makes a mistake
            {
                System.out.println("You must enter a valid response (Y or N): " + playAgain); // tells user what their mistake was
                   done = false;
                   range = false;
                }
            }while (range == false); // loops if user makes a mistake
        }while (done != false); // loops whole program is user responds with yes
    }
}