import java.util.Scanner;

public class TextAnalyzer {

   public static int getNumOfCharacters(String usrStr) {
      int count = 0;
      for (int i = 0; i < usrStr.length(); ++i) {
         count++;
       }
       return count;
   }

   public static void outputWithoutWhitespace(String usrStr) {
      for (int i = 0; i < usrStr.length(); ++i) {
         if (!Character.isWhitespace(usrStr.charAt(i))) {
            System.out.print(usrStr.charAt(i));
         }
      }
      System.out.println();
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter a sentence or phrase:");
      String str = scnr.nextLine();
      System.out.println("\nYou entered: " + str);
      System.out.println("\nNumber of characters: " + getNumOfCharacters(str));
      System.out.print("String with no whitespace: ");
   
      outputWithoutWhitespace(str);

   }
}
