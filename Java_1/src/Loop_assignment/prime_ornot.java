package Loop_assignment;

import java.util.Scanner;

public class prime_ornot {
	
	
	public static void main(String[] args) {
		System.out.println("please enter the number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();
		boolean flag=false;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
			if(!flag)
				System.out.println("number is prime");
			else
			System.out.println("number is not prime");
			
		}
		}
	


