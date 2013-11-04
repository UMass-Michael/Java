// This class simulates a fair, standard die that is used in many games.
import java.util.Random; // to use random number generator

public class Dice
{
  private int spots; // the number of spots up on the die
  // This is a random number generator provided by the Java API   
  private static Random generator;
 
  
  //Constructor creates a single die, initially with no spots
  public Dice()
  {
    generator = new Random(); //creates an instance of the random generator for this die
    spots = 0;
  }
  
  //simulates rolling the die and stores the number rolled
  public void roll()
  {
  //returns a random number 1,2,3,4,5,or 6
    spots = generator.nextInt(6) + 1;
  }
   
  //returns the value of the die
  public int getSpots()
  {
    return spots;
  }
}