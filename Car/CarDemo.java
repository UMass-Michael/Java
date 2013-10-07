import java.util.Scanner;

public class CarDemo
{
  public static void main( String args[] )
  {
    Scanner keyboard = new Scanner(System.in);
    
    Car car1 = new Car(2004, "Toyoya Camry", 0);
    Car car2;
    
    System.out.println("What make of car do you have?");
    car1.setMake(keyboard.nextLine());
    System.out.println("What year is your car?");
    car1.setYear(keyboard.nextInt());
    System.out.println("How fast are you going?");
    car1.setSpeed(keyboard.nextInt());
    System.out.println("You have a " + car1.getYear() + " " + car1.getMake() + " that is going " + car1.getSpeed() + "mph.");
    
    
    System.out.println("How fast do you want to go?");
    car1.setSpeed(keyboard.nextInt());
    System.out.println("Your " + car1.getYear() + " " + car1.getMake() + " is going " + car1.getSpeed() + "mph.");
    System.out.println("Too slow.  Lets speed up by 20.");
    car1.accelerate();
    car1.accelerate();
    car1.accelerate();
    car1.accelerate();
    System.out.println("Now you're going " + car1.getSpeed() + "mph.");
  }
}
  