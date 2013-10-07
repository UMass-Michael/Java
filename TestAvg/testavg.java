import java.util.Scanner;
  
public class testavg
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    double score1;
    double score2;
    double score3;
    double scoreavg;
    
    System.out.println("What is your first score?");
    score1 = keyboard.nextDouble();
    System.out.println("What is your second score?");
    score2 = keyboard.nextDouble();
    System.out.println("What is your third score?");
    score3 = keyboard.nextDouble();
    scoreavg = (score1 + score2 + score3) / 3.0;
    
    System.out.println("Your first score is " + score1);
    System.out.println("Your second score is " + score2);
    System.out.println("Your third score is " + score3);
    System.out.println("Your average score is " + scoreavg);
  }
}