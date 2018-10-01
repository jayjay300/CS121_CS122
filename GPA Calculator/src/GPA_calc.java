import java.util.Scanner;
public class GPA_calc {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float GPA;
		float credits;
		double num_grade;
		String grade;
		String classes; 
		System.out.println("Enter name of class ");
		classes=scan.nextLine();
		System.out.println("Enter number of credits");
		credits=scan.nextInt();
		System.out.println("Enter your letter grade");
		grade=scan.nextLine();
		switch(grade){
		case "A":
		case "a":
			num_grade = 4.0;
			break;
		case "A-":
		case "a-":
			num_grade = 3.7;
			break;
		case "B+":
		case "b+":
			num_grade = 3.3;
			break;
		case "B":
		case "b":
			num_grade = 3.0;
			break;
		case "B-":
		case "b-":
			num_grade = 2.67;
			break;
		case "C+":
		case "c+":
			num_grade = 2.33;
			break;
		case "C":
		case "c":
			num_grade = 2.0;
			break;
		case "C-":
		case "c-":
			num_grade = 1.67;
			break;
		case "D+":
		case "d+":
			num_grade = 1.33;
			break;
		case "D":
		case "d":
			num_grade = 1.0;
			break;
		case "D-":
		case "d-":
			num_grade = 0.67;
			break;
		case "F":
		case "f":
			num_grade = 0;
			break;


		}

	}

}
