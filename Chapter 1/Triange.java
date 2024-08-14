public class Traingle
{
   public static void main(String args[])
   {
   
      for(int i = 1; i <= 5; i++)//PARA SPACE
      {
         for(int s = 1; s <= 5 - i; s++)
         {  //s = space
            //s = 5-i
            System.out.print(" ");
         }  
      
         for(int j = 1; j <= 2 * i - 1; j++)// PARA ASTERISK
         {  //* = 2*i-1
            System.out.print("*");
         }
         
         System.out.println();
      }
   }
}
