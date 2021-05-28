package Class1;
import java.util.Scanner;

public class Scann_Act {

	public static void main(String args[]) {
		String Name, Address, Date;
		int EBNum, Totalunits,PerUnit_price=100,Totalamount;
		float TotalAmount;		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name");
		Name=s.next();		
		System.out.println("Enter the Date");
		Date=s.next();		
		System.out.println("Enter the Address");
		Address=s.next();		
		System.out.println("Enter the EBNum");
		EBNum=s.nextInt();		
		System.out.println("Enter Total Units");
		Totalunits=s.nextInt();		
		Totalamount= Totalunits*PerUnit_price;
		System.out.println("************");
		System.out.println("EB Bill");
		System.out.println("************");
		System.out.print("Name:"+Name);
		System.out.println("\t Date:"+Date);
		System.out.println("Address:"+Address);
		System.out.println("EBNum:"+EBNum);
		System.out.println("Totalunits:"+Totalunits);
		System.out.print("Your Total amount is="+Totalamount);
	
	}

}
