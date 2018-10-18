package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRunner extends TestBase{
	@BeforeClass
	public static void start(){
		TestBase.createChromeDriver();
	}
	
	@AfterClass
	public static void finish(){
		driver.quit();
	}
	
	/*@Test
	public void OpeningGoogle() throws InterruptedException{
		driver.get("https://www.google.com/");
		setText("Bryan Adam",By.name("q"));
		Thread.sleep(2000);
		//click(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/button/div/span/svg"));
		
		Thread.sleep(5000);
	}
	*/
	
	
	/*@Test
	public void xltoDataBase() throws IOException{
		FileInputStream fin=new FileInputStream("C:\\Users\\HP05\\Desktop\\testing.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fin);
		XSSFSheet sheet = book.getSheetAt(0);
		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext()) {
			Row row = (Row) rows.next();
			ArrayList<String> a=new ArrayList<String>();
			Iterator<Cell> cells = row.iterator();
			while (cells.hasNext()) {
				Cell cell = (Cell) cells.next();
				a.add(cell.getStringCellValue());
			}
			//System.out.println(a.get(0)+"  "+a.get(1));
		
		try {
//			Class.forName("com.mysql.jbdc.Driver");
//			Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/suraj","root","root");
			Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suraj","root", "root");
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?)");
			ps.setString(1,a.get(0) );
			ps.setString(2, a.get(1));
			ps.execute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	*/
	
	
	@Test
	public void pToP() throws Exception{
		System.out.println("News");
		System.out.println("0");
		DesiredCapabilities caps=new DesiredCapabilities().chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		System.out.println("1");
		String nurl=" http://192.168.1.15:5556/wd/hub";
		System.out.println("2");
		WebDriver driver=new RemoteWebDriver(new URL(nurl),caps);
		System.out.println("2.5");
		driver.get("https://www.google.com/");
		System.out.println("3");
		setText("Bryan Adam",By.name("q"));
		System.out.println("4");
		
	}
	
	
	
	
}
