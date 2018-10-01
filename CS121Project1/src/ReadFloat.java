import java.util.Scanner;
public class ReadFloat {
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
float flt1;
float flt2;
float sum;
float difference;
float product;
int speed;
int distance;
float time;
System.out.println("Please enter number a");
flt1= scan.nextFloat();
System.out.println("Please enter number b");
flt2= scan.nextFloat();
System.out.println("Enter the speed");
speed = scan.nextInt();
System.out.println("Enter the distance");
distance= scan.nextInt();
sum = flt1+flt2;
difference= flt1-flt2;
product= flt1*flt2;
System.out.println("a+b= "+sum);
System.out.println("a-b= "+difference);
System.out.println("a*b= "+product);
time= (float)distance/(float)speed;
System.out.println("Time is "+time+" hours");
}
}
