package Statements_Java;
import java.util.*;

public class Nestedifelse_stat {

	public static void main(String[] args) {
		
		        int age;
		        String name,citizen;
		        Scanner s =new Scanner(System.in);
		        
		        System.out.println("enter the name");
		        name=s.nextLine();
		        
		        System.out.println("enter the age");
		        age=s.nextInt();
		        
		        if(age>=18)
		        {
		            
		        System.out.println("enter the citizen");
		        citizen=s.next();
		        
		        if(citizen.equals("indian"))
		        {
		            System.out.println("welcome");
		        }
		        
		        else
		        {
		             System.out.println("access denied");
		        }
		         
		        }
		        
		        else
		        {
		            System.out.println("u r not eligible");
		        }
		    }

		// TODO Auto-generated method stub

	}


