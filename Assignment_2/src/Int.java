import java.util.*;
public class Int
{
	public static void main(String []args)
	{
		int num1=0, num2=0;
		float num3=0;
		boolean cont=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers, the first one will be divided by the second.");
		while(cont)
		{
			try
			{
				num1 = scan.nextInt();
				cont = false;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Zero is invalid. Please retry.");
				scan.next();
			}
		} 

		cont = true;
		while(cont)
		{
			try
			{
				num2 = scan.nextInt();
				cont = false;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Zero is invalid. Please retry.");
				scan.next();
			}
		}
		cont = true;
		while(cont)
		{
			try
			{
				System.out.println("The first number entered is " + num1);
				System.out.println("The second number entered is " + num2);
				num3 =((float)num1/(float)num2);
				cont = false;
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Zero is invalid. Please retry.");
				num2 = scan.nextInt();
			}
			System.out.println("The answer is " + num3);
		}
	}
}