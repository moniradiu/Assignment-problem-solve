import java.util.Scanner;


public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd number:");
		int n2=sc.nextInt();
		
		System.out.println("Enter 3rd number:");
		int n3=sc.nextInt();
		
		System.out.println("Enter 4th number:");
		int n4=sc.nextInt();
		
		System.out.println("Enter 5th number:");
		int n5=sc.nextInt();
		
	
		
		if( (n1 % 2) == 0)
		{
			System.out.println("The Number is Even1:" + n1);
		}else if((n1 % 2) !=0 ){
			System.out.println("The Number is odd:" + n1);			
		}//end 1st.
		
		
		if( (n2 % 2) == 0)
		{
			System.out.println("The Number is Even:" + n2);
		}else if((n2 % 2) !=0 ){
			System.out.println("The Number is odd:" + n2);			
		}//end 2nd.
		
		if( (n3 % 2) == 0)
		{
			System.out.println("The Number is Even:" + n3);
		}else if((n3 % 2) !=0 ){
			System.out.println("The Number is odd:" + n3);			
		}//end 3rd.
		
		if( (n4 % 2) == 0)
		{
			System.out.println("The Number is Even:" + n4 );
		}else if((n4 % 2) !=0 ){
			System.out.println("The Number is odd:" + n4 );			
		}//end 4th.
		
		if( (n5 % 2) == 0)
		{
			System.out.println("The Number is Even:" + n5 );
		}else if((n5 % 2) !=0 ){
			System.out.println("The Number is odd:1" + n5 );			
		}//end 5th.

	}

}
