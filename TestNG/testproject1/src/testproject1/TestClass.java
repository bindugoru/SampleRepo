package testproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestClass {

	public static void main(String[] args)  {
	}		
	

	
	
/*	
	@Test 
	public void testrun() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PranavG\\eclipse\\chromedriver.exe");

	    ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Bank of the west");
		WebElement gobutton = driver.findElement(By.name("btnK"));
		gobutton.click();
		Thread.sleep(5000);
		WebElement resultpage = driver.findElement(By.linkText("Bank of the West: Home"));
		resultpage.click();
		String actual = driver.getTitle();
		String expected = ("Home | Bank of the West");
		Assert.assertEquals(expected,actual, "Title is incorrect");
	}

	@Test(dataProvider = "test1")
	public void testrun2(String textToSearch, String linkToFind, String title) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PranavG\\eclipse\\chromedriver.exe");

	    ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(textToSearch);
		WebElement gobutton = driver.findElement(By.name("btnK"));
		gobutton.click();
		Thread.sleep(5000);
		WebElement resultpage = driver.findElement(By.linkText(linkToFind));
		resultpage.click();
		String actual = driver.getTitle();
		String expected = (title);
		Assert.assertEquals(expected,actual, "Title is incorrect");
	}
	
	@DataProvider(name = "test1")
	   public static Object[][] searchTerms() {
	      return new Object[][] { 
	    	  {"Bank of the west", "Bank of the West: Home","Home | Bank of the West"},
	    	  {"bank of america","Bank of America - Banking, Credit Cards, Home Loans and Auto Loans","Bank of America - Banking, Credit Cards, Home Loans and Auto Loans"}
	      };
	   }
	

@Test
public void testrun1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PranavG\\eclipse\\chromedriver.exe");

    ChromeDriver driver = new ChromeDriver();	
	driver.get("https://www.rodanandfields.com");
	WebElement resultpage3 = driver.findElement(By.linkText("SHOP NOW"));
	resultpage3.click();
	WebElement resultpage1 = driver.findElementByLinkText("/Shop/REDEFINE/products");
			resultpage1.click();
			Thread.sleep(5000);
			WebElement resultpage2 = driver.findElement(By.linkText("/Shop/Product/AARG001"));
			resultpage2.click();
			Thread.sleep(5000);
}
			
			
			
	
	
	
	
	//String actual = driver.getTitle();
	//String expected = ("Home | Bank of the West");
	//Assert.assertEquals(expected,actual, "Title is incorrect");
//}
//}




//@Test(dataProvider = "test1")
//public void testrun5(string texttoenter,string texttoenter)throws interrupted Exception {
//System.setProperty("webdriver.chrome.driver","C:\\Users\\PranavG\\eclipse\\chromedriver.exe");

			
			*/
			
			@Test
			public void testrunss() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\PranavG\\eclipse\\chromedriver.exe");
			}
	
			@Test
			public void testruns() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\PranavG\\eclipse\\chromedriver.exe");


				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.bankofthewest.com/");
				driver.navigate().back();
			}
}
