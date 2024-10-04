public class BloodData
{
   private String bloodType;
   private String rhFactor;
   

   public BloodData()
   {
      bloodType = "O";
      rhFactor = "+" ;   
   }
   
   public BloodData(String bType, String rh)
   {
      bloodType = bType;
      rhFactor = rh;
   }
   
   // Setter for bloodType
   public void setBloodType(String bType)
   {
      bloodType = bType;
   }
   
   // Getter for bloodType
   public String getBloodType()
   {
      return bloodType;
   }
   
   // Setter for rhFactor
   public void setRhFactor(String rh)
   {
      rhFactor = rh;
   }
   
   // Getter for rhFactor 
   public String getRhFactor()
   {
      return rhFactor;
   }
   
   // Method to set default patient values
   public void defaultPatient()
   {
      bloodType = "O";
      rhFactor = "+" ;  
   }
   
   // Method to display blood information
   public void displayBloodInfo()
   {
      System.out.println("Your Blood Type is: " + bloodType);
      System.out.println("Your RH Factor is: " + rhFactor);
   }
}
