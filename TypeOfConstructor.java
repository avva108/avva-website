package assignment_3;


class constructor{  
	//creating a default constructor  
	constructor(){
		System.out.println("constructor is created");
		
		}  
	
	int id;  
    String name;  
    //creating a parameterized constructor  
    constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);
	}
     
     
    
}
public class TypeOfConstructors {
       //main method
	public static void main(String[] args) {
		
		System.out.println("this is the default constructor");
		constructor c = new constructor();  
		System.out.println("--------------------------------------------");
		
		System.out.println("this is parametrised constructor");
		  constructor s1 = new constructor(202052343,"vaibhav gupta");  
		   constructor s2 = new constructor(202051000,"default"); 
		  
		   //calling method to display the values of object  
		    s1.display();  
		    s2.display(); 
		    System.out.println("---------------------------------------------");
		
	}

}
