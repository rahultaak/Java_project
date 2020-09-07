package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadnWriteData {
	
	public void ReadNWrite() throws IOException
	{
		File f = new File("../Java_1/src/File_handling/files/my file.txt");
		FileReader  fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		File f2 = new File("../Java_1/src/File_handling/files/my file3.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		
		bw.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ReadnWriteData obj = new ReadnWriteData();
		obj.ReadNWrite();
		
	}
 
}
