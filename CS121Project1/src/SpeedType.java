import java.util.Scanner;
public class SpeedType {
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int speed;
int distance;
float time;
System.out.println("Please enter the speed in mph");
speed = scan.nextInt();
System.out.println("Please enter the distance traveled in miles");
distance= scan.nextInt();
time= (float)distance/(float)speed;
System.out.println("The trip will take "+time+" hours");
}
}

