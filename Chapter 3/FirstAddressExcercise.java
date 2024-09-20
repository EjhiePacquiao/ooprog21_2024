public class FirstAddressExcercise
{
   public static void main(String[] a)
   {
      
      FirstAddressExcercise excersice = new FirstAddressExcercise();//outer instance
      Address company = excersice.new Address();//recylce ang outer instance para sa inner instatnce
      company.getAddress();// nya invoke

}

   class Address
   {
     
      private String hqName = "LG Electronics, Inc.";
      private String Street = "128, Yeoui-Daero";
      private String City = "Yeongdeungpo-Gu, Seoul";
      private String Corp = "Company: LG";
      
      
      public void getAddress()
      {
         System.out.println(hqName);
         System.out.println(Street);
         System.out.println(City);
         System.out.println(Corp);
      }
   }

}
