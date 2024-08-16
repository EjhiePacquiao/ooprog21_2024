public class Traingle
{
   public static void main(String args[])
   {
   
      for(int i = 1; i <= 7; i++)//PARA SPACE for loop
      {
         for(int s = 1; s <= 7 - i; s++)
         {  //s = space
            //s = 7-i
            System.out.print(" ");
         }  
      
         for(int j = 1; j <= 2 * i - 1; j++)// PARA T for loop
         {  //* = 2*i-1
            System.out.print("T");
         }
         
         System.out.println();
      }
   }
}
