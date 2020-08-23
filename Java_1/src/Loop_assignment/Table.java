package Loop_assignment;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();
		for(int i=1;i<=10;i++)
		{
			int t=a*i;
			System.out.println(a+ "*"+ i + "="+ t);
			
		}
	}

}
