package Loop_assignment;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
		System.out.println("please enter the number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int oldnum=num;int sum=0;
		while(num>0)
		{
			int rem = num%10;
			sum=sum*10+rem;
			num =num/10;
		}
		if(oldnum==sum)
		{
			System.out.println("num is palindrome");
			
		}
		
		else
		{
			System.out.println("number is not palindrome");
		}

	}
}