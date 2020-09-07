package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textfile_handling {
	
	public static void main(String[] args) throws IOException {
		File f = new File("../Java_1/src/File_handling/files/my file.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String a;
		while((a=br.readLine())!=null)
				{
	                System.out.println(a);		
				}
	}

}
