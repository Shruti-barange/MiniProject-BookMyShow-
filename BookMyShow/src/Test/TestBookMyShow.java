package Test;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBookMyShow {
		private WebDriver driver;
		private String baseURl;
	
	@Before
	public void setUp() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "D:\\Driverss\\chromedriver.exe");
	   driver = new ChromeDriver();
	   baseURl = "https://in.bookmyshow.com/" ;
	}
  
	@Test
	public void test()  {
		driver.get(baseURl);
		
		//search city
		driver.findElement(By.xpath(".//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys("Delhi");
		driver.findElement(By.xpath(".//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(".//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).sendKeys(Keys.ARROW_DOWN.ENTER);
		
		//click on movies
		//driver.findElement(By.xpath("//*[@id="super-container"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]")).click();
		//select movie
		//driver.findElement(By.xpath("//*[@id="super-container"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[3]/div[1]/div")).click();
		
		
		//click on movies
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]")).click();
		//select movie
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[3]/div[1]/div")).click();
		
	}

    @After
    public void tearDown() throws Exception {
    }
		
}



