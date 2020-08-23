package Loop_assignment;

import java.util.Scanner;

public class Swap_number {
	
	// Swapping of two number using third variable
	
	public static void main(String[] args) 
	
	{
		System.out.println("please enter the value of a");
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		System.out.println("Please enter the value of b");
		Scanner s2 = new Scanner(System.in);
		int b=s2.nextInt();
		
		
		int temp;
		temp=a;
		a=b;
		System.out.println("after swap value of a " +a);
		b=temp;
		System.out.println("after swap value of b " +b);
		
	}

}
