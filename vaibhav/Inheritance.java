package assignment_4;
import java.util.Scanner;
class Room
{
                int length;
                int breadth;
                Room(int x,int y)
                {
                                length = x;
                                breadth = y;
                }
                int area()
                {
                                return(length*breadth);
                }
}
class BedRoom extends Room    //Inheriting Room
{
                int height;
                BedRoom(int x,int y,int z)
                {
                                super(x,y);          //Pass value to superclass
                                height = z;
                }
                int volume()
                {
                                return (length*breadth*height);
                }
}
public class Inheritance
{
                public static void main(String args[])
                {
                	Scanner sc = new Scanner(System.in);
                	System.out.println("enter the length of your room : ");
                	int l =sc.nextInt();
                	
                	System.out.println("entrer the  breadth of you room : ");
                	int b =sc.nextInt();
                	
                	System.out.println("entrer the height of your room : ");
                	int h =sc.nextInt();
                	
                	
                    BedRoom room=new BedRoom(l,b,h);
                    int area=room.area();            //Superclass method
                    int volume=room.volume();        //Baseclass Method
                                
                    System.out.println("area of the room is : "+area+" sq");
                    System.out.println("volume of the room is : "+volume+" sq");
                }
}

