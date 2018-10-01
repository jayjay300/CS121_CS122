import java.util.Scanner;
import java.util.Stack;

public class Stack {

public static boolean conj(char p,char q){
if (p=='T'&&q=='T')
	return true;
else
	return false;

}
public static boolean disj(char p,char q){
if(p=='F'&&q=='F')
	return false;
else
	return true;
}
public static void main(String args[]){
	char p;
	char q;
	boolean answer;
	
	Stack stack = new Stack();
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter equation");
	String e = scan.nextLine();
	for (int i=0; i<e.length(); i++){
		char selection = e.charAt(i);
		if (selection == 'T')
		{
			stack.push(p);
		}
		else if(selection == 'F')
		{
			stack.push(q);
		}
		else if(selection == 'v' || selection == 'V')
		{
			stack.pop(i);
			stack.pop(i-1);
			answer= conj(p, q);
		}
		else if(selection == '^'){
			disj(p,q);
		}
		else
			System.out.println("Invalid");
	}
}
}