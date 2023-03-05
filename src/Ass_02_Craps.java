import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6)+1;
        int die2 = rnd.nextInt(6)+1;
        int crapsRoll = die1 + die2;
        int point = 0;

        if (crapsRoll == 7 || crapsRoll == 11)
        {
            System.out.println("You rolled " + crapsRoll + "." + " You won by rolling a natural!");
        } else if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
        {
            System.out.println("You rolled a crap out, " + crapsRoll + "." + "You lose.");
        }
        else
        {
            System.out.println("You rolled a " + crapsRoll + "." + "This is kept as a point.");
            crapsRoll = point;
        }
        if (point==crapsRoll)
        {


            int die01 = rnd.nextInt(6)+1;
             int die02 = rnd.nextInt(6)+1;
            int crapsRoll2 = die02 + die01;
            do {
                 if (crapsRoll2 == point)
                 {
                     System.out.println("You matched the point by rolling a " + crapsRoll2 + "!"  + " You win!");
                 }
                 else if (crapsRoll2 == 7)
                 {
                     System.out.println("You lost by rolling a 7.");
                 }
                 else
                 {
                     System.out.println("You rolled a " + crapsRoll2 + " Keep rolling");
                 }
        }while (crapsRoll2 != 7 || crapsRoll2 != point);
        }
    }
}