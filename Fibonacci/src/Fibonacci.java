import java.util.InputMismatchException;
import java.util.Scanner;
public class Fibonacci {
		public static void main (String []args)
		{
			int num1=0;
			boolean integer=true;
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter how many numbers you want in fibonacci's sequence");
			
			while(integer=true)
			{
				try
				{
					num1 = scan.nextInt();
					integer = false;
					for(int count=0;count<=num1;count++)
						System.out.println(fibonacci(count));
					int answer= fibonacci(num1);
					System.out.println("Fibonacci's number to the "+num1+"th number is "+answer);
				}
				catch(InputMismatchException e){
					System.out.println("Invalid. Please enter an integer");
					scan.next(); //Why can't this be scan.nextint?
				}
				}
		}
		public static int fibonacci (int num1)
		{
			/*int fib1=0;
			 int fib2=1;
			 int fibsum;
			 for(int count=0;count<=num1;count++)
			 {
				 fibsum = fib1+fib2;
			 fib1=fib2;
			 fib2=fibsum;
			 }
			 return fibsum;
			 }NOT RECURSIVE*/
				 
			 

			if(num1 == 0)
				return 0;
			else if(num1 == 1)
					return 1;
			else
				return (fibonacci(num1-1) + fibonacci(num1-2));
			
			}
			
		}
/*Since the problem works exponentially, it takes a while to find the answer.
It is actually adding up the answers, going 1+1=2,(1+1=2)+ (1+2=3)=5, etc etc
They create "call stacks" that build up over time.
With the loop, the method I accidentally used first, it is building off the previous answers, so it doesn't take as long.
Will recursive works it isn't efficient for larger numbers.
*/ 