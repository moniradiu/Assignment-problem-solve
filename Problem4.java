import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// user input
				Scanner in = new Scanner(System.in);
				
		        System.out.print("Input 1st integer: ");
		        int firstInt = in.nextInt();
		        
		        System.out.print("Input 2nd integer: ");
		        int secondInt = in.nextInt();
		  
		  //user input print.with sum,odd,multi.
		  
		        System.out.println("The sum is: "+ (firstInt + secondInt));
		        System.out.println("The difference is:"+ (firstInt - secondInt));
		        System.out.println("The product is:" + (firstInt * secondInt));

	}

}
