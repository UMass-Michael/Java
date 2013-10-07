public class Car
{
  private int yearModel;
  private String make = new String();
  private int speed;
  
  public Car(int year, String brand, int velocity)
  {
    yearModel = year;
    make = brand;
    speed = velocity;
  }
    public void setYear(int year)
    {
      yearModel = year;
    }
    public void setMake(String brand)
    {
      make = brand;
    }
    public void setSpeed(int velocity)
    {
      speed = velocity;
    }
    
    
    public void accelerate()
    {
      speed = speed + 5;
    }
    public void brake()
    {
      speed = speed - 5;
    }
    
    
    public int getYear()
    {
      return yearModel;
    }
    public String getMake()
    {
      return make;
    }
    public int getSpeed()
    {
      return speed;
    }
}