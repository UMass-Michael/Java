// This class simulates rolling a pair of dice 10,000 times and
// counts the number of times doubles of are rolled for each
// different pair of doubles.
public class DiceSimulation
{
  public static void main(String[] args)
  {
    final int NUMBER = 10000; //the number of times to roll the dice
    Dice die1 = new Dice(); // the first die
    Dice die2 = new Dice(); // the second die
    
    int die1Value; // number of spots on the first die
    int die2Value; // number of spots on the second die
    int count = 0; // number of times the dice were rolled
    int snakeEyes = 0; // number of times snake eyes is rolled
    int twos = 0; // number of times double two is rolled
    int threes = 0; // number of times double three is rolled
    int fours = 0; // number of times double four is rolled
    int fives = 0; // number of times double five is rolled
    int sixes = 0; // number of times double six is rolled

    //TASK #1 Enter the code for your algorithm here (see lab manual):
    //see page 268 for while loop example
    
    // ===== While loop =====
    while (count < 10000)
    {
      die1.roll();
      die1Value = die1.getSpots();
      die2.roll();
      die2Value = die2.getSpots();
      if (die1Value == die2Value)
      {
        if (die1Value == 1)
        { snakeEyes = snakeEyes + 1; }
        else if (die1Value == 2)
        { twos = twos + 1; }
        else if (die1Value == 3)
        { threes = threes + 1; }
        else if (die1Value == 4)
        { fours = fours + 1; }
        else if (die1Value == 5)
        { fives = fives + 1; }
        else if (die1Value == 6)
        { sixes = sixes + 1; }
      }
      count = count + 1;
    }
 
    
/*    // ===== Do-while loop =====
    do
    {
      die1.roll();
      die1Value = die1.getSpots();
      die2.roll();
      die2Value = die2.getSpots();
      if (die1Value == die2Value)
      {
        if (die1Value == 1)
        { snakeEyes = snakeEyes + 1; }
        else if (die1Value == 2)
        { twos = twos + 1; }
        else if (die1Value == 3)
        { threes = threes + 1; }
        else if (die1Value == 4)
        { fours = fours + 1; }
        else if (die1Value == 5)
        { fives = fives + 1; }
        else if (die1Value == 6)
        { sixes = sixes + 1; }
      }
      count = count + 1;
    }
    while (count < 10000);
*/
    
 /*   // ===== For loop =====
    for (count=0; count<10000; count++)
    {
      die1.roll();
      die1Value = die1.getSpots();
      die2.roll();
      die2Value = die2.getSpots();
      if (die1Value == die2Value)
      {
        if (die1Value == 1)
        { snakeEyes = snakeEyes + 1; }
        else if (die1Value == 2)
        { twos = twos + 1; }
        else if (die1Value == 3)
        { threes = threes + 1; }
        else if (die1Value == 4)
        { fours = fours + 1; }
        else if (die1Value == 5)
        { fives = fives + 1; }
        else if (die1Value == 6)
        { sixes = sixes + 1; }
      }
    }
 */   

    System.out.println ("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
    System.out.println ("You rolled double twos " + twos + " out of " + count + " rolls.");
    System.out.println ("You rolled double threes " + threes + " out of " + count + " rolls.");
    System.out.println ("You rolled double fours " + fours + " out of " + count + " rolls.");
    System.out.println ("You rolled double fives " + fives + " out of " + count + " rolls.");
    System.out.println ("You rolled double sixes " + sixes + " out of " + count + " rolls.");
  }
}