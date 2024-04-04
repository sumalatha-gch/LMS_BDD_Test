package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReaderData {

	public static FileInputStream fi;
	public FileOutputStream fo;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public XSSFRow row;
	public static XSSFCell cell;
	public CellStyle style;   
	public File jsonFile;
    public static int totalRow;
	public static String xl_path="C:\\Projects\\LMS_R_BDD_2\\src\\test\\resources\\TestData\\LMS_API_AVengersTestData.xlsx";
    private static HashMap<String, List<Map<String, String>>> excelRows = new HashMap<>();

    private static ExcelReaderData xlData;
    
    private ExcelReaderData() {
    	
    }
    
    // Read the login credentials from the excel sheet "Login"
    
	@Test
	public HashMap<String,String> loginCred() throws IOException {
		
		File excel=new File(xl_path);
		FileInputStream fis=new FileInputStream(excel);
		XSSFWorkbook work=new XSSFWorkbook(fis);
		XSSFSheet sht=work.getSheet("batches");
		Cell c1 = sht.getRow(1).getCell(0);
		Cell c2=sht.getRow(1).getCell(1);
		Cell c3=sht.getRow(1).getCell(2);
		Cell c4=sht.getRow(1).getCell(3);
		
		HashMap<String,String> hm=new HashMap();
		hm.put("username", c1.getStringCellValue()); 
		hm.put("password", c2.getStringCellValue());
		hm.put("invalidusername", c3.getStringCellValue());
		hm.put("invalidpassword", c4.getStringCellValue());
		
		
		work.close();
		return hm;
	}
	
	 private static void readSheetListMap(Sheet sheet) {
	        Row row;
	        Cell cell;
	        totalRow = sheet.getLastRowNum();
	        for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
	            row = sheet.getRow(currentRow);
	            int totalColumn = row.getLastCellNum();
	            LinkedHashMap<String, String> columnMapData = new LinkedHashMap<>();
	            for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
	                cell = row.getCell(currentColumn);
	                String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn).getStringCellValue();
	               
	                if (null != cell) {
	    				if(cell.getCellType() == CellType.NUMERIC) {
	    					cell.setCellType(CellType.STRING);
	    				}
	                		columnMapData.put(columnHeaderName, cell.getStringCellValue());
	                }else
	                    columnMapData.put(columnHeaderName, "");
	            }
	            String keyFeature = columnMapData.get("Features"); 
	            if(excelRows.get(keyFeature) == null) {
	            	excelRows.put(keyFeature, new ArrayList<Map<String,String>>());
	            }
	            List featureRows = excelRows.get(keyFeature);
	            featureRows.add(columnMapData);
	        
	        }
	       
	    }

	 // Get total row count in excel
	    public int countRow() {
	        return totalRow;
	    }
	    
	  // process excel and get excel 
	    public static void getSheetDataForFeature(String sheetName) throws IOException {
	    	
			fi=new FileInputStream(xl_path);
			workbook=new XSSFWorkbook(fi);
			sheet=workbook.getSheet(sheetName);
	        workbook.close();
	        readSheetListMap(sheet);
	    }
	    
		// read excel for given worksheet - batches
	    public static synchronized ExcelReaderData getInstance() throws IOException {
	    	try {
				if (xlData == null) {
					xlData = new ExcelReaderData();
					getSheetDataForFeature("batches");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("Excel Keys "+xlData.excelRows.keySet());
	    	return xlData;
	    }
	    
	    // get the list of rows from the processed excel by feature key - column c (Features)
	    
	    public List<Map<String, String>> getRowsListByFeatureKey(String featureKey){
	    	return xlData.excelRows.get(featureKey);
	    }
	    
	    public static void main(String[] args) throws IOException {
	    	List<Map<String, String>> featureRowsMap = ExcelReaderData.getInstance().getRowsListByFeatureKey(" User Sign In");
	    	System.out.println("Excel Keys "+excelRows.get("GET All Programs"));
	    }

}
