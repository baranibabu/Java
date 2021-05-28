package arrays_java;

import java.util.Scanner;

public class matrxsub_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r1,c1,r2,c2;
        
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter the row size");
        r1=s.nextInt();
        
        System.out.println("Enter the col size");
        c1=s.nextInt();
        
        int m1[][]=new int[r1][c1];
        
        int sub[][]=new int[r1][c1];
        
        System.out.println("Enter values of 1st matrix:");
        
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                m1[i][j]=s.nextInt();
            }
        }
        
        System.out.println("Enter the row size");
        r2=s.nextInt();
        
        System.out.println("Enter the col size");
        c2=s.nextInt();
        System.out.println("Enter values of 2nd matrix:");
        
        int m2[][]=new int[r2][c2];  
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                m2[i][j]=s.nextInt();
            }
        }
        
        
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
if(r1!=r2 && c1!=c2)
        {
             System.out.println(" matrix size should be same:");
        }
        
        else
        {
          for(i=0;i<r1;i++)
        {
            for( j=0;j<c1;j++)
            {
                
                
                sub[i][j]=m1[i][j]-m2[i][j];
                System.out.print(add[i][j]+" ");
                
            }
            
            System.out.println();
        }  
        }
}      
        }
	
	}

}
