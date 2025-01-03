package LabProgram;

public class OverLoading {
  public void calculate (int num){
    System.out.println("Square of " + num + " is " + num * num);
  }

  public void calculate (int num1, int num2){
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
  }

  public void calculate (double num1, double num2){
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
  }
  public void calculate (float num1, float num2) {
    System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
  }

  public void calculate (String str1, String str2) {
    System.out.println("Concatenation of " + str1 + " and " + str2 + " is " + (str1 + str2));
  }

  public void calculate (int num1, int num2, int num3) {
    System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + " is " + (num1 + num2 + num3));
  }

  public static void main(String[] args) {
    OverLoading ol = new OverLoading();
    ol.calculate(5);
    // ol.calculate(5);
     ol.calculate(10, 20);
     ol.calculate(10.5, 20.5);
    // ol.calculate(10.5f, 20.5f);
    // ol.calculate("Hello", "World");
    // ol.calculate(10, 20, 30);
  }
}
