package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataOfline {
	
	public static void main(String[] args) throws IOException {
		ReadDataOfline obj = new ReadDataOfline();
		obj.Read_data_of_perticural_line(12);
	
	}
	
	public void Read_data_of_perticural_line(int lineno) throws IOException
	{
		File f =new File("../Java_1/src/File_handling/files/my file2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		int flag=0;
		String r;
		int n;
		//for(int i =1;i<=lineno;i++)
		
		
		while(( r=br.readLine())!=lineno)
		{
			
			if(flag==lineno)
			{
				
				System.out.println(r);
			}
			
			else {
				br.readLine();
				//System.out.println();
			}
			
			
			
			
		
		}
	
		
		
				
	}
	
	

}

