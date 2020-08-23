package Loop_assignment;

import java.util.Scanner;

public class Even_odd {
	
	public static void main(String[] args) 
	
	{
		System.out.println("please enter the number");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		
		if(a%2==0)
		
		{
			System.out.println("this is a even number");
			
		}
		else
		{
			System.out.println("this is a odd number");
		}
	}

}
