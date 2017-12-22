import java.util.Scanner;


public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number:");
		
		int mark=sc.nextInt();
		
		if( mark >= 90)
		{
			System.out.println("Your Grade: A");	
		}
		else if( mark >= 80 && mark < 89 )
		{
			System.out.println("Your Grade: B");	
		}
		else if( mark >=70 && mark < 79)
		{
			System.out.println("Your Grade: C");
		}
		else if( mark >= 60 && mark < 69)
		{
			System.out.println("Your Grade: D");
		}
		else if(mark >= 59 && mark < 50 )
		{
			System.out.println("Your Grade: F");
		}

	}

}
