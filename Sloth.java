public class Sloth implements Animal
{
  private static final int numberOfLimbs = 4;
  private int slothCount;
  private int moveSpeed;
  private String noise;
  private int location;
  private String species;
  private int animalNumber;
  private int weight;
  private int length;

  public Sloth(int speed, String sound, String type, int w, int l)
  {
    weight = w;
    length = l;
    moveSpeed = speed;
    noise = sound;
    animalNumber = slothCount;
    location = 0;
    slothCount++;
    species = type;
  }

  public Sloth(int w, int l)
  {
    this(1, "Yawn", "Sloth", w, l);
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