package Statements_Java;
import java.util.*;

public class Loop_stat {

	public static void main(String[] args) {
		int a=0,n,Ans;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		while(a<=n) {
			if(a%2==0)
			System.out.println(a);
			a++;//or can given in Incr as a+=2
		}
		
			// TODO Auto-generated method stub

	}

}
