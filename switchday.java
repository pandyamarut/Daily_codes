import java.util.Scanner;
class switchday {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a day: ");
     int week = input.nextInt();
      String day;

      switch (week) {
         case 1:
           day = "Sunday";
           break;
         case 2:
           day = "Monday";
	   break;
         case 3:
           day = "Tuesday";
           break;
         case 4:
           day = "Wednesday";
           break;
         case 5:
           day = "Thursday";
           break;
         case 6:
           day = "Friday";
           break;
         case 7:
           day = "Saturday";
           break;
         default:
           day = "Invalid day";
           break;
      }
      System.out.println(day);
   }
}
