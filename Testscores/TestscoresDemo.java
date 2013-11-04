import java.util.Scanner;

public class TestscoresDemo
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    Testscore testgrades = new Testscore(1);
    Testscore score2 = new Testscore(1);
    Testscore score3 = new Testscore(1);
    double avg;
    String grade;
    int numtests = 0;
    String input = new String();
    char more;
    
    System.out.println("What is the first test score?");
    testgrades.setScore(+keyboard.nextDouble());
    do 
    {
      System.out.println("Is there another test? Y/N");
      keyboard.nextInt();
      input = keyboard.nextLine();
      more = Character.toUpperCase(input.charAt(0));

      
      System.out.println("What is the test score?");
      testgrades.setScore(+keyboard.nextDouble());
    } while (more == 'Y');
    
    avg =  testgrades.getScore() / numtests;
    
    if (avg < 60)
    {
      grade = "F";
    }
    else
    {
      if (avg < 70)
      {
        grade = "D";
      }
      else
      {
        if (avg < 80)
        {
          grade = "C";
        }
        else
        {
          if (avg < 90)
          {
            grade = "B";
          }
          else
          {
            grade = "A";
          }
        }
      }
    }
    
    System.out.println("Your average score is " + avg + ", which is the letter grade " + grade + ".");
  }
}