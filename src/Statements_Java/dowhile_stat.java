package Statements_Java;

import java.util.Scanner;

public class dowhile_stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		do {
					System.out.println(a);
			a+=2;
		}while(a<=n);//while should be kept in same line
	}

}
