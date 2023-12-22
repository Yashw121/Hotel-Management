import java.util.Scanner;

public class Customer 
{
	String name;
	Scanner sc = new Scanner(System.in);
	void getCustDetail()
	{
		System.out.println("Please Enter Your Name :");
		name = sc.nextLine();
		
	}
	void dispcustDetail()
	{
		System.out.println("        Name : "+name);
		System.out.println();
	}

}
