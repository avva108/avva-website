package assignment_2;
import java.util.Scanner;

  class AreaOfCircle
  {
	
	double area;
											//constructor
	AreaOfCircle(double radius)
	{	
		
		area = (22 * radius * radius) /7;
		System.out.println("the area of circle is : "+area);
	}
	
  }
 
class AreaOfCircleUsingConstructor
{

 public static void main(String[] args) 	//main function
 {
	 
	 Scanner sc = new Scanner (System.in);
	 
	 System.out.println("enter the value of radius to find the area : "); 	//taking input from user
	 double radius = sc.nextDouble();
	 
	 AreaOfCircle area = new AreaOfCircle(radius);	//calling from constructor
	
	 
  }
 }
