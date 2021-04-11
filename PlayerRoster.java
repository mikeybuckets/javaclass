import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int roster[]=new int[5];
      int rating[]=new int[5];
      char choice;

      for(int i=0;i<5;i++)
      {
      System.out.println("Enter player "+(i+1)+"'s jersey number:");
      roster[i]=scnr.nextInt();
      System.out.println("Enter player "+(i+1)+"'s rating:");
      rating[i]=scnr.nextInt();
      }
      do
      {
      System.out.println("MENU:");
      System.out.println("u - Update player rating ");
      System.out.println("a - Output players above a rating ");
      System.out.println("r - Replace player ");
      System.out.println("o - Output roster ");
      System.out.println("q - Quit");
      System.out.println("Choose your option:");
      choice=scnr.next().charAt(0);   
      switch(choice)
      {
      case 'u': System.out.println("Enter the player number");
      int n=scnr.nextInt();
      System.out.println("Enter new jersey number");
      roster[n-1]=scnr.nextInt();
      System.out.println("Enter new Player's rating");
      rating[n-1]=scnr.nextInt();
      break;
      case 'a': System.out.println("Enter the rating");
      n=scnr.nextInt();
      for(int i=0;i<5;i++)
      {
      if(rating[i]>=n)
      System.out.println("Player "+(i+1)+": jersey number: "+roster[i]+" rating: "+rating[i]);
      }
      break;
      case 'r': System.out.println("Enter the jersey number of the player you want to replace");
      n=scnr.nextInt();
      for(int i=0;i<5;i++)
      {
      if(roster[i]==n)
      {
      System.out.println("Enter new jersey number");
      roster[i]=scnr.nextInt();
      System.out.println("Enter new Player's rating");
      rating[i]=scnr.nextInt();
      break;
      }
      }
      break;
      case 'o': for(int i=0;i<5;i++)
      System.out.println("Player "+(i+1)+"'s jersey number: "+roster[i]+" rating: "+rating[i]);
      break;
      case 'q': System.out.println("Exit");
      break;
      default: System.out.println("Wrong choice");
      }   
      }while(choice != 'q');
   }
