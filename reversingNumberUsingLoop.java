package assignment_1;
import java.util.Scanner;

public class reversingNumberUsingLoop {

	public static void main(String[] args) {
		// asking the user to input the number
		System.out.println("enter the number you want to reverse :");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println("you entered :" +number);
		
		int reverseNumber = 0;
		
	    	while (number != 0)  // loop will check the number upto it becomes zero
		   {
		    	int remainder = number%10;      //finding the remainer of number
			    reverseNumber =  reverseNumber*10 + remainder;
			    number = number/10;
		   }
		System.out.println(" the reversed number is : " +reverseNumber);

      }

}
