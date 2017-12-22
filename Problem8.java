import java.util.Scanner;


public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 
  System.out.println("Enter first number:");
  int n1=sc.nextInt();
  
  System.out.println("Enter second number:");
  int n2=sc.nextInt();
   
  

  
  if(n1 >n2 ){
	  System.out.println("The First is greater");
  }else if(n1 < n2){
	  System.out.println("The Second is greater");
	  
  }else{
	  System.out.println("The numbers are equal");
  }
  
  
	}

}
