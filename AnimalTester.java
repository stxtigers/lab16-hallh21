public class AnimalTester
{
  public static void main(String[] args)
  {
    Squirrel s1 = new Squirrel(4, 5);
    Sloth sl1 = new Sloth(4, 6);

    s1.move(2);
    sl1.move(2);
    System.out.println(s1.toString());
    System.out.println(sl1.toString());
  }
}