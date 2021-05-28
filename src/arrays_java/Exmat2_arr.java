package arrays_java;
import java.util.*;

public class Exmat2_arr {

	public static void main(String[] args) {
	int r,c,i,j ;
	 Scanner s =new Scanner(System.in);
     
     System.out.println("Enter the row size");
     r=s.nextInt();
     
     System.out.println("Enter the col size");
     c=s.nextInt();
     
     int m1[][]=new int[r][c];
      System.out.println("enter the values of matrix 1");
      for(i=0;i<r;i++) 
      {
    	  for (j=0;j<c;j++)
    	  {
    		  m1[i][j]=s.nextInt();
    	  }
      }
    
      
      int m2[][]=new int[r][c];
  
      System.out.println("enter the values of matrix 2");
      for(i=0;i<r;i++) 
      {
    	  for (j=0;j<c;j++)
    	  {
    		  m2[i][j]=s.nextInt();
    	  }
      }
  boolean t=true;
  for(i=0;i<r;i++) 
  {
	  for (j=0;j<c;j++)
	  {
  if (m1[i][j]!=m2[i][j])
  {t=false;
   }
  if (t)
  {  System.out.print("Both matrix is Equal"); 
  }
  else
  {
	  System.out.print("Both matrix is  not Equal"); 
	  break;
  }
	  }
  }
	}
}
	
  
	  
	// TODO Auto-generated method st