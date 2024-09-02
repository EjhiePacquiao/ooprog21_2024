/*
numOfGuest;
object numGuest
 pricePerGuest = 35;
totalGuest;
totalPrice;
boolean izzitLargeEvent

System.out.println("*************************************"); 
      System.out.println("*\t Carly's makes food that makes \t*");
      System.out.println("*\t\t\t\t it a party \t\t\t\t*");
      System.out.println("*************************************");

*/
import java.util.Scanner;
public class CarlysEventPrice
{
   public static void main(String args[])
   {
      int numOfGuest;
      int pricePerGuest = 35;
      int totalGuest;
      int totalPrice;
      
      System.out.println("****************************************************");
      System.out.println();
      System.out.println();

   
      System.out.println("*************************************"); 
      System.out.println("*\t Carly's makes food that makes \t*");
      System.out.println("*\t\t\t\t it a party \t\t\t\t*");
      System.out.println("*************************************");
      
      Scanner Guest = new Scanner(System.in);
      System.out.println("Please Enter the Number of guest on your upcomming event.");
      numOfGuest = /*obj*/Guest.nextInt();
      totalPrice = numOfGuest * pricePerGuest;
      
      System.out.println();
     
      System.out.println("Number of Guest: " +numOfGuest); 
      System.out.println("Price per Guest: $" +pricePerGuest);
      System.out.println("Total Price: $" +totalPrice);
      
      boolean izzitLargeEvent = numOfGuest >= 50;
      System.out.println("Is the job classified as a Large event? " +izzitLargeEvent);
      
      
      System.out.println();
      System.out.println();
      System.out.println("****************************************************");
   } 
}