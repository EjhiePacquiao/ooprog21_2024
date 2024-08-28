class warmup_sleepin
{
   public static void main(String args[])
   {
      warmup_sleepin obj = new warmup_sleepin();
      System.out.println(obj.sleepIn(false, false)); // true
      System.out.println(obj.sleepIn(true, false));  // false
      System.out.println(obj.sleepIn(false, true));  // true
   }
   
   
   public boolean sleepIn(boolean weekday, boolean vacation)
   {
      return !weekday || vacation;
   }
}