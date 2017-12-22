import java.util.Scanner;


public class Problem11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number");
		int n1=sc.nextInt();
		
		System.out.print("Enter 2nd number");
		int n2=sc.nextInt();
		
		System.out.print("Enter 3rd number");
		int n3=sc.nextInt();
		
		System.out.print("Enter 4th number");
		int n4=sc.nextInt();
		
		System.out.print("Enter 5th number");
		int n5=sc.nextInt();
		
		float average=(float)((n1+n2+n3+n4+n5)/5.0 );
		
		System.out.println("Average number:" + average);
		

	}

}
