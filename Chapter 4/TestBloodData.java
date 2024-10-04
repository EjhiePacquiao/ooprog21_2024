import java.util.Scanner;

public class TestBloodData
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      BloodData bD = new BloodData();
       
      System.out.println("Enter Blood Type: ");
      String bloodType = input.nextLine();        
      
      bD.setBloodType(bloodType);         
      System.out.println("Enter RH Factor: ");
      String rhFactor = input.nextLine();
        
      bD.setRhFactor(rhFactor);  
       
      bD.displayBloodInfo();
   }
}
