import java.util.Scanner;


public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 =sc.nextInt();
		
		if(n1 > n2){
			System.out.println("First is greater");
		}else{
			System.out.println("First is not greater");
		}

	}

}
