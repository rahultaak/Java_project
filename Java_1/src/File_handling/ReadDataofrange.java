package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataofrange {
	
	
		
		
	

	public void ReadDatainrange(int start,int end) throws IOException
	{
		File f = new File("../Java_1/src/File_handling/files/my file2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		int flag = 0;
		
		while ((s=br.readLine())!=null)
			
		{
			flag = flag+1;
			if (flag>=start && flag<=end)
			{
				System.out.println(s);
			}
		}
		 
	}
		 public static void main(String[] args) throws IOException {
			 System.out.println("please enter initial number");
			 Scanner r = new Scanner(System.in);
			 int inital=r.nextInt();
			 
			 System.out.println("please enter end number");
			 Scanner t = new Scanner(System.in);
				int end = t.nextInt();	 
			 
				
				ReadDataofrange obj = new ReadDataofrange();
				obj.ReadDatainrange(inital, end);
		
		
	}
}
