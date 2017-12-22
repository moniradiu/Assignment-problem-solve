import java.util.Scanner;


public class Problem23 {

	public static void main(String[] args) {
		/*Write the Java code of a program that calculates the area of a rectangle given height and width.*/
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of Rectangle:");
		double length = sc.nextDouble();
		
		System.out.println("Enter the width of Rectangle:");
		double width = sc.nextDouble();
		//Area = length*width;
		double area = length*width;
		System.out.println("Area of Rectangle is:"+area);
		

	}

}
