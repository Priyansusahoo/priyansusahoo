public class test {
  private static final double Index = 0;

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    BMI(78, 1.69);
    {
      //    System.out.println("Marks BMI is " + Index);
    }
    BMI(92, 1.95);
    {
      //    System.out.println("John's BMI is" + Index);
    }
  }

  public static double BMI(int mass, double height) {
    if (height <= 0d && mass <= 0d) {
      System.out.println("Invalid number");
    } else if (height > 0d && mass > 0d) {
      double Index = mass / (height * height);
      System.out.println(Index);
    }
    return Index;
  }
}
