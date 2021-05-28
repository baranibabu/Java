package Statements_Java;

import java.util.Scanner;

public class switchavgmark_stat {

	public static void main(String[] args) {
		String name;
		int Reg_Num,m1,m2,m3,Tot_marks;
		char Grade;
		System.out.println("Enter  Name");
		Scanner s=new Scanner(System.in);
			name=s.next();
			System.out.println("Enter  Reg Num");
		Reg_Num=s.nextInt();
			System.out.println("Enter  marks1");
			m1=s.nextInt();
			System.out.println("Enter  marks2");
			m2=s.nextInt();
			System.out.println("Enter  marks3");
			m3=s.nextInt();
			Tot_marks=m1+m2+m3;
			System.out.println("********************");
			System.out.println("Student Aggregate");
			System.out.println("********************");
			System.out.println("student Name:"+name);
			System.out.println("Reg Num:"+Reg_Num);
			System.out.println("Subject 1:"+m1);
			System.out.println("Subject 2:"+m2);
			System.out.println("Subject 3:"+m3);
			System.out.println("Total marks:"+Tot_marks);
			int Avg;
			Avg=Tot_marks/3;
			System.out.println("Avg marks:"+Avg);
			switch(Avg)
			{
			case 80:
				System.out.println("Grade is A");
			break;
			case 60:
				System.out.println("Grade is B");
				break;
			case 50:
				System.out.println("Grade is C");
				break;
			case 40:
			System.out.println("Grade is D");
			break;
			default:
				System.out.println("Yor are failed");
				
				
		// TODO Auto-generated method stub

	}

}
}
