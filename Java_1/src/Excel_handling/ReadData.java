package Excel_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadData {
	
	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("../Java_1/src/Excel_handling/excel handling/Input.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		System.out.println("total rows "+ r);
		System.out.println("total column "+ c);
	
		for (int i=0;i<r;i++) 
		
		{
			for(int j=0;j<c;j++)
			{
				Cell c1= ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	} 
	
	

}
