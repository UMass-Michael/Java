// Use this file to complete Lab 3 Tasks #1-4.
// Develop your Television Class in this file.
// Use the Rectangle Class on pages 134-135 as a guide.

public class Television //The purpose of this class is to model a TV
                        //Michael White - October 2, 2013
{
    //declare the 2 constant attributes here with the keyword "final" (see page 75)
  private String manufacturer; 
  private int screensize;
  
  //declare the other 3 attributes here (a boolean and 2 ints)
  boolean powerOn; // Is the power turned on?
  int channel;     // What channel is it on?
  int volume ;     // What volume is it at?
  
  //  Write your constructor method here, remember a constructor method has the same
  //  name as the class.  It is used to give initial values to the attributes of the class (see page 146)
  public Television(String brand, int size) 
  {
    manufacturer = brand;
    screensize = size;
    powerOn = false;
    volume = 20;
    channel = 2;
  }
  public int getVolume() // Used to get the volume
  { 
    return volume;        
  }
  public int getChannel() // Usec to get the channel
  { 
    return channel;       
  }
  public String getManufacturer() // Used to get the manufacturer
  { 
    return manufacturer;  
  }
  public int getScreenSize() // Used to get the screen size
  { 
    return screensize;    
  }
  public void setChannel(int choosechannel) // Used to set the TV channel
  { 
    channel = choosechannel;
  }
  public void power() // Used to turn power on and off
  {
    powerOn = !powerOn;
  }
  public void increaseVolume() // Used to increase the volume
  {
    volume = volume + 1;
  }
  public void decreaseVolume() // Used to decrease the volume
  {
    volume = volume - 1;
  }
  
    
  
  
  
  //write your 4 accessor ("get") methods here.  Each accessor method will return a value.  
  //  These methods do not take in any data.  (see the Rectangle class pages 134-135)
  
  
  
  // write your 4 mutator ("set") methods here.  Each mutator method will change the value of the appropriate
  //   attribute.  These methods do not return any values. (see the Rectangle class pages 134-135)
  
  
}