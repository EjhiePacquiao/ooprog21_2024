import java.util.Scanner;

public class prelim
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number: ");
      int num = scanner.nextInt();
      feBo(num);
   }
   //febo
      public static void feBo(int num)
      {
         int next;
         int a = 0;
         int b = 1;
         for(int i = 0; i <= num; i++)
         {   
            System.out.printf("\nFibonacci:(%d) = %d", i,a);
            next = a + b;
            a = b;
            b = next;
         }
     }    
}
 
