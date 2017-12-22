import java.util.Scanner;


public class Problem14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		
		int n=sc.nextInt();
		
		if( ( (n %2) == 0) && ( n > 10) ){
			System.out.println("An even number greater than 10");
		}
		
		if( ( (n %2) == 0) && ( n <= 10) ){
			System.out.println("An even  number  not greater than 10");
		}
		
		if( ( (n %2) != 0) && (n>10) ){
			System.out.println("An odd number greater than 10");
		}
		
		if ( ( (n %2) != 0 ) &&  (n <= 10) ){
	 			
	 		System.out.println("An odd number less than 10");
	 			
	 		}
	}

}
