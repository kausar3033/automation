package bongobd.com.Automation;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class main extends DriverConfiguration {
	
public static String baseUrl= "https://bongobd.com/";
	
	@Test
	public static void justClick() throws InterruptedException {

		driver.get(baseUrl);
		// code for opening site home page.
		
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);;
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//code for navigating to the URL & maximizing browser
		
		
		//verify page title (unit test)
		String actualTitle ="BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere";
		String siteTitle = driver.getTitle();
		//Matching result
		Assert.assertEquals(actualTitle, siteTitle);
		System.out.println("Title print: "+siteTitle);
		
		//code for scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	
		driver.findElement(By.xpath("//span[normalize-space()='Music']")).click();
		
		//verify Music page (unit test)
		String text = driver.findElement(By.xpath("//span[normalize-space()='Music']")).getText();
		System.out.println("Music text get: "+text);
		Thread.sleep(3000);
		
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,3100)");
        Thread.sleep(3000);
		
        js.executeScript("window.scrollBy(0,-50)");
        Thread.sleep(3000);
		
        
		// code for play video
		driver.findElement(By.xpath("(//div[@class='MuiCardMedia-root jss782 jss949'])[1]")).click();
		
		//verify loaded video title
		String text2 = driver.findElement(By.xpath("//h5[@class='MuiTypography-root jss1009 MuiTypography-h5']")).getText();
		System.out.println("Video text get: "+text2);
		Thread.sleep(20000);
		
		
		
	}
	

}
