public class Employee
{
    // Declaring variables used
    private String name;
    private int id;
    private String department;
    private String position;
    
    // Creates the object Employee
    public Employee(String names, int num, String dept, String pos)
    {
      name = names;
      id = num;
      department = dept;
      position = pos;
    }
      public void setName(String names)
      {
        name = names;
      }
      public void setId(int idNumber)
      {
        id = idNumber;
      }
      public void setDept(String dept)
      {
        department = dept;
      }
      public void setPos(String pos)
      {
        position = pos;
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