package arrays_java;

import java.util.Scanner;

public class arrexcep_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s =new Scanner(System.in);
	        
	        System.out.println("Enter the array size ");
	        int n=s.nextInt(); // 0 t0 9
	        
	        int arr[]=new int[n];
	        
	        
	       System.out.println("Enter the array values ");
	       
	       for(int i=0;i<n;i++) // exception
	       {
	           arr[i]=s.nextInt();
	       }
	        
	       System.out.println("Entered values are: ");
	       
	       for(int i=0;i<n;i++)
	       {
	           System.out.println(arr[i]);
	       }
	}

}
