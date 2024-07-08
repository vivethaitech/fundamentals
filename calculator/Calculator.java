package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome to Calculator...");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter First Number");
     double num1 = sc.nextDouble();
     System.out.println("Enter Second Number");
     double num2 = sc.nextDouble();
     System.out.println("Choose Operation");
     System.out.println("1.Addition");
     System.out.println("2.Subraction");
     System.out.println("3.Multiplication");
     System.out.println("4.division");
     System.out.println("Enter your choice(1/2/3/4)");
     int choice = sc.nextInt();
     double result=0;
     switch(choice) {
     case 1:
    	 result=num1+num2;
    	 break;
     case 2:
    	 result=num1-num2;
    	 break;
     case 3:
    	 result=num1*num2;
    	 break;
     case 4:
    	 result=num1/num2;
    	 break;
     default:
    	 System.out.println("Invalid Choice");
     }
     if (choice >= 1 && choice <= 4) {
         System.out.println("The result is: " + result);
     }   
	}
}
