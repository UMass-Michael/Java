import java.util.Scanner;

public class Pay
{
  public static void main(String[] args)
  {
  Scanner keyboard = new Scanner(System.in);
  
  double hours;
  double rate;
  double pay;
  
  System.out.print("How many hours did you work?");
  hours = keyboard.nextDouble();
  System.out.print("How much do you get paid per hour?");
  rate = keyboard.nextDouble();
  
  if(hours <= 40)
    pay = hours * rate;
  else
    pay = (hours - 40) * (1.5 * rate) + 40 * rate;
  System.out.println("You earned $" + pay);
  }
}