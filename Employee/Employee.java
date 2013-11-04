public class Employee
{
    // Declaring variables used
    private String name;
    private int id;
    private String department;
    private String position;
    
    // Creates the object Employee
    public Employee()
    {
      this.name = name;
      this.id = id;
      this.department = department;
      this.position = position;
    }
      public void setName(String name)
      {
        this.name = name;
      }
      public void setId(int id)
      {
        this.id = id;
      }
      public void setDept(String department)
      {
        this.department = department;
      }
      public void setPos(String position)
      {
        this.position = position;
      }
      
      // Calls the values stored for displaying
      public String getName()
      {
        return name;
      }
      public int getId()
      {
        return id;
      }
      public String getDept()
      {
        return department;
      }
      public String getPos()
      {
        return position;
      }
}