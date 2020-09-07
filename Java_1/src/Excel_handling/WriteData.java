package Excel_handling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteData {
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File f = new File("../Java_1/src/Excel_handling/excel handling/output.xls");
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Sheet1", 0);
		 for(int i=0;i<10;i++)
		 {
			 for(int j=0;j<10;j++)
			 {
				 Label l = new Label(j, i, "rahul");
				 ws.addCell(l);
			 }
		 }
		 
		 wk.write();
		 wk.close();
	
	}

}
