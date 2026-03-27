public class printfmethod {
    public static void main(String[] args) {
      boolean myBoolean = true;
      char myChar = '@';
      int myInt = 50;
      String myString = "Bro";
      double myDouble = 1000;
      // System.out.printf("%b",myBoolean);
      // System.out.printf("%c",myChar);
      // System.out.printf("%s",myString);
      // System.out.printf("%d",myInt);
      // System.out.printf("%f",myDouble);
      // System.out.printf("Hello %-10s",myString);
      // System.out.printf("You have this much money %.2f",myDouble);
      System.out.printf("You have this much money %,f",myDouble);
    }
}
