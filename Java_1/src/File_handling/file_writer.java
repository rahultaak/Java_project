package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
	
	public static void main(String[] args) throws IOException {
		File f = new File("../Java_1/src/File_handling/files/my file2.txt");
		FileWriter fw = new FileWriter(f, true);
		fw.write("this is end of line of file w=2");
		fw.close();
		
		//for(int i=0;i<=20;i++)
		//{
			//bw.write("this is line number " + i + " of file 2");
			//bw.newLine();
			
		//}
		
		//bw.close();
	}

}
