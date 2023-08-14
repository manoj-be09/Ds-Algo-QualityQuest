package utilities;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;

import com.google.common.collect.Table.Cell;

public class ExcelReader {
	
	FileInputStream file = new FileInputStream("src/test/resources/excelTestData/DsAlgoTestData.xlsx");
    Workbook workbook = new XSSFWorkbook(file);
    Sheet sheet = workbook.getSheet(sheetName);

    Iterator<Row> rowIterator = sheet.iterator();
    while (rowIterator.hasNext()) {
        Row row = rowIterator.next();
        Cell cell = row.getCell(0); // Assuming you want to read data from the first cell (column) in each row
        if (cell != null) {
            String cellValue = cell.getStringCellValue();
            System.out.println("Data from Excel: " + cellValue);

            // Now you can use the cellValue in your Selenium automation
            // For example, input it into a text field using Selenium WebDriver:
            // driver.findElement(By.id("yourTextFieldId")).sendKeys(cellValue);
        }
    }
}
