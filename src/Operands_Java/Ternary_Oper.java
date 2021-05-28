package Operands_Java;

import java.util.Scanner;

public class Ternary_Oper {

	public static void main(String[] args) {
		int a ,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the vakue of a");
		a=s.nextInt();
		System.out.println("enter the vakue of b");
		b=s.nextInt();
int min=(a>b) ? a : b;
        
        System.out.println("minimum value is:"+min);

		// TODO Auto-generated method stub

	}

}
