/*
hour
extramin
rentCost = 40
additional 1 dolla per min

*/

import java.util.Scanner;

public class SammysRentalPrice
{
   public static void main(String args[])
   {
   
      System.out.println("****************************************************");
      System.out.println();
      System.out.println();
   
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S \t Sammy's make it fun in the sun. \t S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println();
      
      
      //CONSTANT refer in chap2
      int COST_PER_HOUR = 40;
      int COST_PER_ADD_MIN = 1;
      int MIN_IN_HOUR = 60;
      
      int totalMin;
      int hours;
      int totalPrice;
      int extraMin;
            
      Scanner Rent = new Scanner(System.in);
      System.out.println("Please enter the number of minutes you rented the equipment.");
      totalMin = /*obj*/Rent.nextInt();
     
      hours = totalMin / MIN_IN_HOUR;
      extraMin = totalMin % MIN_IN_HOUR;
      totalPrice = (hours * COST_PER_HOUR) + (extraMin * COST_PER_ADD_MIN);
      
      //hour, min, total price
      System.out.println("Hours: " +hours);
      System.out.println("Extra Minutes: " +extraMin);
      System.out.println("Total Price: $" +totalPrice);
      
      System.out.println();
      System.out.println();
       System.out.println("****************************************************");



   }
}