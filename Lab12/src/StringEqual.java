import java.util.Scanner;

public class StringEqual

{

   public static void main(String[] args)

   {
	   Scanner scan = new Scanner(System.in);
System.out.println("Enter a value for str2");
	String str2 = scan.nextLine();
System.out.println("Enter a value for str3");
	String str3 = scan.nextLine();

      System.out.println("str2 = " + str2);

      System.out.println("str3 = " + str3);

      if (str2.compareTo(str3)==0)//cannot compare strings like numbers, strings are unicode values
      {
         System.out.println("Same");
      }
      if (str2.compareTo(str3)<0)
      {
    	System.out.println("Str2 is less than str3");  
      }
      else

         System.out.println("Str2 is bigger than str3");

   }

}