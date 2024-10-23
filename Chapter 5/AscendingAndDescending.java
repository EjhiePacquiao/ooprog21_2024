import java.util.Scanner;

public class AscendingAndDescending
{
   public static void main(String[] a)
   {
                  Scanner input = new Scanner(System.in);
                  
                  int num1, num2, num3;
                  int lowest, middle, highest;
                  
                  System.out.println("Please enter the any number: ");
                  num1 = input.nextInt();
                  
                  System.out.println("Please enter the any number again: ");
                  num2 = input.nextInt();
            
                  System.out.println("Please enter the any number one more time: ");
                  num3 = input.nextInt();
                  
                  if(num1 <= num2 && num1 <= num3)// if low si frstNum
                  {
                     lowest = num1;
                     if(num2 <= num3)
                     {
                        middle = num2;
                        highest = num3;
                     }
                     else
                     {
                        middle = num3;
                        highest = num2;
                     }
                  } 
                  else
                  {
                     if(num2 <= num1 && num2 <= num3)// if low si scndNum
                     {
                        lowest = num2;
                        if(num1 <= num3)
                        {
                           middle = num1;
                           highest = num3;            
                        }
                        else
                        {
                           middle = num3;
                           highest = num1;
                        }
                     }
                     else
                     {
                        lowest =  num3;
                        if(num1 <= num2)
                        {
                           middle = num1;
                           highest = num2;
                        }
                        else
                        {
                           middle = num2;
                           highest = num1;
                        }
                     }
                        
                    }
                
                   System.out.println("Ascending: " +lowest+ " " +middle+ " " +highest);
                   System.out.println("Descending: " +highest+ " " +middle+ " " +lowest);
               
   }
}