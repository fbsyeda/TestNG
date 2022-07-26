package qaUtil;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    XSSFWorkbook workbook;
    XSSFSheet sheet;

    //Why constructor is needed - it is same as class name,
    //When ever object is created a default constructor is created but we can create our own
    //When ever object is created it will go through constructor to get the parameters -
    // So now Project path, Sheet name will be moved from methods to constructor
    //
    public ExcelUtil(String excelPath, String sheetName){
        try {


            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();}
    }


    public int getRowCount() {
        int rowCount = 0;
        try {

            rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("Number of rows" + rowCount);
        } catch (Exception exp) {

            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

        return rowCount;
    }

    public int getCellCount() {
        int colCount = 0;
        try {

            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Number of columns" + colCount);
        } catch (Exception exp) {

            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return colCount;

    }

    public String getCellData(int rowNum, int colNum){

        String cellData = null;

        try {


            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

            //System.out.println(cellData);

        }
        catch (Exception exp){
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return cellData;

    }
}



