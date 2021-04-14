public class Employee
{
  protected String lastName;
  protected double payRate;
  private static int employeeNumber;
  
  protected int idNumber;

  public Employee()
  {
    payRate = 15;
    lastName = "Smith";
    idNumber = employeeNumber;
    employeeNumber++;

  }

  public void setLastName(String name)
  {
    lastName = name;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setPayRate(double pr)
  {
    payRate = pr;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public int getCount()
  {
    return employeeNumber;
  }

  public String toString()
  {
    return "Employee: " + lastName + ", Pay Rate: " + payRate;
  }

  
}