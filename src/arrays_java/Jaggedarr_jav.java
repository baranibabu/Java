package arrays_java;

import java.util.Scanner;

public class Jaggedarr_jav {

	public static void main(String[] args) {
	
        Scanner s =new Scanner(System.in);
        
        int arr[][]=new int[3][];
        
        arr[0]=new int[2]; //new int[2] means column 2 for 1 st row
        arr[1]=new int[3];
        arr[2]=new int[4];
        
        System.out.println("Enter the values");
        
        for(int i=0;i<arr.length;i++)
        {
        for(int j=0;j<arr[i].length;j++)    
        {
            arr[i][j]=s.nextInt();
        }
        }
     
        
        System.out.println("Entered  values are");
        
        for(int i=0;i<arr.length;i++)
        {
        for(int j=0;j<arr[i].length;j++)    
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
    
}


	
