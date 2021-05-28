package Statements_Java;
import java.util.*;

public class Switchcase_Stat {

	public static void main(String[] args) {
		char letter;
		System.out.println("enter the letter");
		Scanner s=new Scanner(System.in);
		letter=s.next().charAt(0);
		switch(letter) 
		{
			case'A':
			case'a':
				System.out.println("Given letter A is vowel ");
				break;
			case'E':
			case'e':
				System.out.println("Given letter E is vowel ");
				break;
			case'I':
			case'i':
				System.out.println("Given letter I is vowel ");
				break;
			case'O':
			case'o':
				System.out.println("Given letter O is vowel ");
				break;
			case'U':
			case'u':
				System.out.println("Given letter U is vowel ");
				break;
				default:
					System.out.println("Given letter is not a Vowel:"+letter);
				
				
		
		
		// TODO Auto-generated method stub

	}

	}
}
