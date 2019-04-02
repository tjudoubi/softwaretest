package softwaretestJunit;

import java.util.regex.Pattern;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Cookie; 
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class TestLabTwo {

	ArrayList<Info> list = new ArrayList<Info>();
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void Load() throws Exception {
		File file = new File("软件测试名单22.xls");
		try {
			FileInputStream fis = new FileInputStream(file);
			StringBuilder sb = new StringBuilder();
			jxl.Workbook rwb = Workbook.getWorkbook(fis);
			Sheet[] sheet = rwb.getSheets();
			for (int i = 0; i < sheet.length; i++) {
				Sheet rs = rwb.getSheet(i);
				for (int j = 2; j < rs.getRows()-1; j++) {
					Info st = new Info();
					//Cell[] cells = rs.getColumn(j);
					//st.id = cells[0].getContents();
					st.s_id = rs.getCell(1,j).getContents();
					st.name = rs.getCell(2,j).getContents();
					st.github_url = rs.getCell(3,j).getContents();
					list.add(st);
					System.out.println(st.s_id);
					
				}
			}
			fis.close();
			// result += sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String driverPath = System.getProperty("user.dir") + "/resources/driver/geckodriver.exe";
		//String driverPath = "J:/Java-doubi/softwaretest/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		baseUrl = "http://121.193.130.195:8800";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test
	public void testBaidu() throws Exception {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			//清除所有的缓存
			 driver.manage().deleteAllCookies();
			driver.get(baseUrl + "/login");
			//WebElement we = driver.findElement(By.id("kw"));
//			we.click();
			// driver.findElement(By.id("kw")).click();
			driver.findElement(By.name("id")).clear();
			driver.findElement(By.name("id")).sendKeys(list.get(i).s_id);
			driver.findElement(By.name("password")).sendKeys(list.get(i).s_id.substring(4));
			driver.findElement(By.id("btn_login")).click();
			Info info = new Info();
			info.s_id = driver.findElement(By.id("student-id")).getText().toString();
			info.name = driver.findElement(By.id("student-name")).getText().toString();
			info.github_url = driver.findElement(By.id("student-git")).getText().toString();
			 
			assertEquals(list.get(i).s_id+" "+list.get(i).name+" "+list.get(i).github_url,info.s_id+" "+info.name+" "+info.github_url);
		}
	}

}
