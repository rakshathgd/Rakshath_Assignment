package corejava.assignments.datastructure;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username ");
		String usernmae=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		if(usernmae.equals("raks")&&pass.equals("raks1234"))
		{
			System.out.println("Welcome "+usernmae);
		}
		else
		{
			int count=0;
			for(int i=1;i<4;i++)
			{
				System.out.println("enter correct username ");
				usernmae=sc.next();
				System.out.println("enter correct password");
				pass=sc.next();
				if(usernmae.equals("kiki")&&pass.equals("kiki21"))
				{
					System.out.println("Welcome "+usernmae);
					break;
				}
				count++;
			}
			if(count==3)
				System.out.println("contact admin");
			
		}

	}

}
