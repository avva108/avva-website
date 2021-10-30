package assignment_2;
import java .util.Scanner;
public class ShopItems {
	public static void insertionSort(int arr[] ,int n ) {
		for (int i=0; i<n; i++) {						//n + 1 times						c1
			int temp = arr[i];							//n times							c2
			int j = i-1;								//n times							c3	
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];						//(n*(n-1))/2 times the				c4
														//while loop is working				c5
				j--;
				
			}
			arr[j+1] = temp;							// n-1 times						c6
		}	
	}
 public static int binarySearch(int[] arr, int key) {
	 int low = 0;										// 1 time							c7
	 int high = arr.length-1;							// 1 time							c8
	 while(low <= high) {
		 int mid = (high + low)/2;
		 if(arr[mid] == key) {
			 return mid +1;
		 }									//time complexity of binary search will be log(n) base 2
		 else if(key > arr[mid]) {			//because each time our searching area will be shorten by half
			 low = mid + 1; 
		 }									// c9
		 else {
			 high = mid-1;
		 }
	 }
	 return -1;
 }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);									// 1 time		c10
		System.out.println("enter the number of items in shops : ");			// i time		c11
		int n = sc.nextInt();													//1 time		c12
		
		System.out.println("enter the price of items in shop : ");				//1 time		c13
		int [] arr = new int[n];												//1 time		c14
		for (int i=0; i<n; i++) 												// n times		c15
		{						
			arr[i] = sc.nextInt();												///n times		c16
			
		}
		insertionSort(arr, n);													//n*n times		c17
		System.out.println("items in shop after sorting according to their price is : ");
		for(int i=0; i<n; i++) {												//n times		c18
			System.out.print(arr[i]+" ");												
			
		}
		System.out.println(" ");												// 1 time		c19
		System.out.println("enter the price of item you want to search: ");		//1 time  		c20
		int key = sc.nextInt();													// 1 time		c21
		System.out.println("your item is in the "+binarySearch(arr, key)+" row");	//log(n)base2   c22
		
	} 
}
