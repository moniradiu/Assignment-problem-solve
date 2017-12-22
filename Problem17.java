import java.util.Scanner;


public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int n=sc.nextInt();
		
		if( ((	n % 2 ) == 0 ) && (( n % 5 ) == 0 )){
			System.out.println(n);
		}
	}

}
