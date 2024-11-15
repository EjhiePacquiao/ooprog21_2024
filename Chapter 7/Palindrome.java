import java.util.*;
public class Palindrome
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String phrase;
      String message;
      int i, j = 0, midPoint; // midpoint kay center or middle [point sa mga value
      char first, last;
      boolean isPalindrome = true;
      System.out.print("Enter a string: ");
      phrase = input.nextLine();
      
      
      int stringLength = phrase.length();//.length() kay length sa SB object equals sa num of characters na naa sa sulod sa string
    
      midPoint = stringLength / 2;
      i = stringLength - 1;
      j = 0;
      while(j <= midPoint)
      {
         first = Character.toLowerCase(phrase.charAt(j));
         last = Character.toLowerCase(phrase.charAt(i));
         if(first != ' ' && last != ' ')
         {
            if(first != last)
            {
               isPalindrome = false;
               j = midPoint;
            }
            --i;
            ++j;
         }
        else
           if(first == ' ')
              ++j;
           else
              --i;
      }
      if(isPalindrome)
          message = "This is a palindrome";
      else
          message = "This is not a palindrome";   
      System.out.println(message);
   }
}