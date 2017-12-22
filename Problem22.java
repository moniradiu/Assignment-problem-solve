import java.util.Scanner;


public class Problem22 {

	public static void main(String[] args) {
		/*
		 * 
		 * . Write the Java code that takes as input your final marks and shows as output the letter grade.
90        -     100       =     A        (4.0)       Excellent
85        -     <90       =     A-       (3.7)       
80        -     <85       =     B+      (3.3)       
75        -     <80       =     B        (3.0)       Good
70        -     <75       =     B-       (2.7)       
65        -     <70       =     C+      (2.3)       
60        -     <65       =     C        (2.0)        Fair          
57        -     <60       =     C-       (1.7)       
55        -     <57       =     D+      (1.3)       
52        -     <55       =     D        (1.0)        Poor
50        -     <52       =     D-       (0.7)       
<50                        =      F        (0.0)        Failure       

		 * 
		 * */
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Press between A to F");
		String st=scan.next();
		
		
		switch (st){
		
		case "A":
			System.out.println("Your marks is between 90-100");
			break;
		case "A-":
			System.out.println("Your marks is between 85-90");
			break;
		case"B+":
			System.out.println("Your marks is between 80-85");
			break;
		case"B":
			System.out.println("Your marks is between 80-75");
			break;
		case"B-":
			System.out.println("Your marks is between 75-70");
			break;
		case"c+":
			System.out.println("Your marks is between 70-65");
			break;
		case"c":
			System.out.println("Your marks is between 65-60");
			break;
		case"c-":
			System.out.println("Your marks is between 60-59");
			break;
		case"D+":
			System.out.println("Your marks is between 55-57");
			break;
		case"D":
			System.out.println("Your marks is between 55-52");
			break;
		case"D-":
			System.out.println("Your marks is between 52-50");
			break;
		case "F":
			System.out.println("Oopps!!!!Your marks is between 50");
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		
		

	}

}
