package com.org.PHP_Maven_Test.PHP_Maven_Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Verify_test {
 
	 public String baseUrl = "http://ec2-18-222-204-148.us-east-2.compute.amazonaws.com/index.php";
	    //String driverPath = "D:\\Chrome-Driver\\chromedriver.exe";
	   String driverPath = "/usr/local/bin/chromedriver";
	    public WebDriver driver ; 
	    
	
	@Test
  public void VerifyAboutPageTest() {
  
		System.out.println("launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
try {
			driver.findElementById("About Us").click();
			String AboutCont="AThis is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
			String ActualCont = driver.findElementById("PID-ab2-pg").getText();
			Assert.assertEquals(AboutCont, ActualCont);
		//Assert.assertTrue(true);
		} catch (Exception e) {
			System.out.println("Invalid Element");
		//Assert.assertTrue(false);
		driver.close();
		}

driver.close();	

}
}