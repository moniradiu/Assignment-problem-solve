import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of a circle: ");
		double r = sc.nextDouble();
		
		double circumference = 2 * 3.1416 * r;
		double area = 3.1416 * (r*r);
		
		System.out.println("circumference of circle is: " + circumference);
		System.out.println("Area of circle is: "+area);
		
	}

}