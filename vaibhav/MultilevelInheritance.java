package assignment_5;
import java.util.*;

class SuperClass
	{
	String sc_default = "SuperClass_Default";
	private String sc_private = "SuperClass_Private"; 
	protected String sc_protected = "SuperClasst_Protected";
	public String sc_public = "SuperClass_Public";
	}

class ChildClass extends SuperClass 
	{
	String cc_default = "ChildClass_Default";
	private String cc_private = "ChildClass_Private"; 
	protected String cc_protected = "ChildClass_Protected";
	public String cc_public = "ChildClass_Public"; 
	}

class GrandChildClass extends ChildClass 
    {
	String gc_default = "GrandChildClass_Default";
	private String gc_private = "GrandChildClass_Private"; 
	protected String gc_protected = "GrandChildClass_Protected"; 
	public String gc_public = "GrandChildClass_Public";
	}
public class MultilevelInheritance {
	
		public static void main(String[] args)
		{
		System.out.println();
		System.out.println("creating objects for all 3 classes :");
		System.out.println("1. SuperClass");
		System.out.println("2. ChildClass");
		System.out.println("3. GrandChildClass");
		System.out.println("-----------------------------------------------------------------------------------");
		
		SuperClass sc = new SuperClass();
		ChildClass cc = new ChildClass();
		GrandChildClass gc = new GrandChildClass();
		
		System.out.println("From SuperClass, we can access:");
		System.out.println(sc.sc_default + ", " /*+ sc.sc_private + ", "*/ + sc.sc_protected + ", " + sc.sc_public);
		System.out.println("we cannot access 'sc_private' because it is only accessible within the same class");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("From Parent Class, we can access:");
		System.out.println(cc.sc_default + ", " /*+ cc.sc_private + ", "*/ +cc.sc_protected + ", " + cc.sc_public);
		System.out.println(cc.cc_default + ", " /*+ cc.cc_private + ", "*/ + cc.cc_protected + ", " + cc.cc_public);
		System.out.println("we cannot access 'sc_private' and 'cc_private because these are only accessible within the same class");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("From Child Class, we can access:"); 
		System.out.println(gc.sc_default + ", "  /*+ gc.sc_private + ", "*/ +gc.sc_protected +", " + gc.sc_public);
		System.out.println(gc.cc_default + ", " /*+ gc.cc_private + ", "*/ + gc.cc_protected +", " + gc.cc_public);
		System.out.println(gc.gc_default + ", " /*+ gc.gc_private + ", "*/ + gc.gc_protected + ", " + gc.gc_public);
		System.out.println("we cannot access 'sc_private','cc_private' and 'gc_private because these are only accessible within the same class");
		System.out.println(); 
		}
}
