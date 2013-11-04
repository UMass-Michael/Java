public class Car
{
  private int yearModel;
  private String make = new String();
  private int speed;
  
  public Car(int yearModel, String make, int speed)
  {
    this.yearModel = yearModel;
    this.make = make;
    this.speed = speed;
  }
    public void setYear(int yearModel)
    {
      this.yearModel = yearModel;
    }
    public void setMake(String make)
    {
      this.make = make;
    }
    public void setSpeed(int speed)
    {
      this.speed = speed;
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