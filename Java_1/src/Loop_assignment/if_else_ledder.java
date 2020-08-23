package Loop_assignment;

import java.util.Scanner;

public class if_else_ledder {
	
	public static void main(String[] args) 
	{
	System.out.println("please enter the marks");
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	if((a>=0)&&(a<40))
	{
		System.out.println("fail");
	}
	
	else if ((a>=40)&&(a<60))
	{
		System.out.println("pass");
	}
	
	else if ((a>=60)&&(a<80))
	{
		System.out.println("first division");
	}
	
	else if ((a>=80)&&(a<=100))
	{
		System.out.println("topper");
	}
	else
	{
		System.out.println("Please enter valid marks");
	}
		
	
	
	
	
	}

}
