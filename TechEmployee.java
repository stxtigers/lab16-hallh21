public class TechEmployee extends Employee
{
  protected String qual;

  public TechEmployee()
  {
    super();
    qual = "Robotics";
  }

  public void setQual(String q)
  {
    qual = q;
  }

  public String getQual()
  {
    return qual;
  }

  public void setPayRate(double pr)
  {
    payRate = pr * 2;
  }

  public String toString()
  {
    return "Employee" + lastName + ", Pay Rate: " + payRate + ", Qualification: " + qual;
  }
}