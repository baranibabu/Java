package arrays_java;
import java.util.*;

public class Ex1_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int emp_no[] =new int[20];
		        
		        Scanner s =new Scanner(System.in);
		        
		        System.out.println("Enter the employee numbers");
		        
		        for(int i=0;i<20;i++)
		        {
		            emp_no[i]=s.nextInt();
		        }
		        
		        
		        
		        System.out.println("Entered  employee numbers are:");
		        
		        for(int i=0;i<20;i++)
		        {
		            System.out.println(i+" index "+emp_no[i]);
		        }

	}

}
 
/*{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter the no of employees"); 
        int nos=s.nextInt();
        
        int emp_no[] =new int[nos];
        
        
        
        System.out.println("Enter the employee numbers");
        
        for(int i=0;i<nos;i++)
        {
            emp_no[i]=s.nextInt();
        }
        
        
        
        System.out.println("Entered  employee numbers are:");
        
        for(int i=0;i<nos;i++)
        {
            System.out.println(i+" index "+emp_no[i]);
        }
        
        
        }*/

