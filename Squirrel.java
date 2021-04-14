public class Squirrel implements Animal
{
  public static final int numberOfLimbs = 4;

  private static int squirrelCount;

  protected int moveSpeed;
  protected String noise;

  protected int location;

  protected String species;
  protected int animalNumber;
  protected int weight;
  protected int length;


  public Squirrel(int speed, String sound, String type, int w, int l)
  {
    weight = w;
    length = l;
    moveSpeed = speed;
    noise = sound;
    animalNumber = squirrelCount;
    location = 0;
    squirrelCount++;
    species = type;
  }

  public Squirrel(int w, int l)
  {
    this(4, "Chitter", "Squirrel", w, l);
  }

  public void move(int numberOfSeconds)
  {
    location = moveSpeed * numberOfSeconds;
  }

  public String sound()
  {
    return noise;
  }
  
  public String toString()
  {
    String str = species + " " + animalNumber + ", location " +  location;
    return str;
  }
}