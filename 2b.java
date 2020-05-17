import java.util.Scanner;
import java.util.StringTokenizer;

class Customer
{
	String cname,dob;
	Scanner sobj=new Scanner(System.in);
	
void read()
	{
		System.out.println("Enter Customer name:");
		cname=sobj.next();
		System.out.println("Enter Customer DOB in the format dd/mm/yyy");
		dob=sobj.next();	
	}
	
void display()
	{
		StringTokenizer st = new StringTokenizer(dob, "/");
		System.out.print(cname+",");
		while(st.hasMoreTokens()) 
		{ 
			String val = st.nextToken();
			System.out.print(val);
				if(st.countTokens()!=0)
				System.out.print(","+" ");
		} 	
	}		 
}

  class Main {
	public static void main(String[] args) {
		Customer cobj=new Customer();
		cobj.read();
		System.out.println("Customer Details");
		System.out.println("---------------------");
		cobj.display();
	}
}

