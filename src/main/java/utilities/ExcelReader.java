package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	 public static String getDataFromExcel(String sheetName, int rowNumber, int columnNumber) throws IOException {
	        FileInputStream fis = new FileInputStream("src/test/resources/excelTestData/DsAlgoTestData.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet(sheetName);

	        Row row = sheet.getRow(rowNumber);
	        Cell cell = row.getCell(columnNumber);

	        String cellValue = "";
	        if (cell != null) {
	            if (cell.getCellType() == CellType.STRING) {
	                cellValue = cell.getStringCellValue();
	            } else if (cell.getCellType() == CellType.NUMERIC) {
	                cellValue = String.valueOf(cell.getNumericCellValue());
	            }
	        }

	        workbook.close();
	        fis.close();

	        return cellValue;
	    }

}
