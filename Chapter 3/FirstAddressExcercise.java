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
     
      private String Brand = "LG Company";
      private String Street = "128, Yeoui-Daero";
      private String City = "Yeongdeungpo-Gu, Seoul";
      private String hqName = "Company: LG Electronics, Inc.";
      
      
      public void getAddress()
      {
         System.out.println(Brand);
         System.out.println(Street);
         System.out.println(City);
         System.out.println(hqName);
      }
   }

}