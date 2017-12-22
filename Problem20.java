import java.util.Scanner;


public class Problem20 {

	public static void main(String[] args) {
		/*Write the Java code of a program that reads a student’s mark for a single subject, and prints out “Pass” 
		 * if the student got more than 50, and “You shall not pass” otherwise.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		
		int subject=sc.nextInt();
		
		if( subject > 50 ){
			System.out.println("Pass");
		}else
		{
			System.out.println("You shall not pass");
		}

	}

}
