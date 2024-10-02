import java.util.Scanner;

public class MathTest
{

   public static void main(String[] a)
   {
      Scanner input = new Scanner(System.in);
      
      // inputs
      System.out.print("Enter a number for SQRT: ");// Math.sqrt()
      double sqrtNum = input.nextDouble();
      
      System.out.print("Enter a number for SIN: ");//MAth.sin()
      double sinNum = input.nextDouble();
      
      System.out.print("Enter a number for COS: ");//Math.cos()
      double cosNum = input.nextDouble();
      
      System.out.print("Enter a number for FLOOR: ");//Math.floor()
      double floorNum = input.nextDouble();
      
      System.out.print("Enter a number for CIEL: ");//Math.ciel()
      double ceilNum = input.nextDouble();
      
      System.out.print("Enter a number for ROUND: ");//Math.round()
      double roundNum = input.nextDouble();
      
      System.out.print("Enter the first number for MIN:");//Math.min()
      int minFrstNum = input.nextInt();
      System.out.print("Enter the second number for MIN: ");//Math.min()
      int minScondNum = input.nextInt();
      
      System.out.print("Enter the first number for MAX: ");//Math.max()
      int maxFrstNum = input.nextInt();
      System.out.print("Enter the second number for MAX: ");//Math.max()
      int maxScndNum = input.nextInt();
      
      
      
      
      //output
       System.out.println("SQRT: " +  Math.sqrt(sqrtNum));
       System.out.println("SIN: " + Math.sin(sinNum));
       System.out.println("COS: " + Math.cos(cosNum));
       System.out.println("FLOOR: " + Math.floor(floorNum));
       System.out.println("ROUND: " + Math.round(roundNum));
       System.out.println("CEIL: " + Math.ceil(ceilNum));
       System.out.println("MAX: " + Math.max(maxFrstNum, maxScndNum));
       System.out.println("MIN: " + Math.min(minFrstNum, minScondNum));
       
       //Math random
       double randomNum = Math.random() * 100;
       System.out.print("Random: " + randomNum);
       
       input.close();
      
      
   }
   
}

// Math.sqrt()
//Math.pow()
//MAth.sin()
//Math.cos()
//Math.floor()
//Math.ciel()
//Math.round()
//Math.random()
//Math.min()
//Math.max()

