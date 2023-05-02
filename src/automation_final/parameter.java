package automation_final;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parameter extends hommme {



	
	
	@Test(priority = 1)
	public void myTestCase1() throws InterruptedException {
		// to navigate to the sign up page

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");

		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("aya");

		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("odat");

		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("ayaodat821@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("ayooshodatsaleem12@");

		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("ayooshodatsaleem12@");

		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();

		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ayaodat821@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ayooshodatsaleem12@");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();

		Thread.sleep(3000);

		String welcome = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span")).getText();

		System.out.println(welcome);
		Boolean checkTheWordWelcome = welcome.contains("Welcome");

		SoftAssert myAssert = new SoftAssert();

		myAssert.assertEquals(checkTheWordWelcome, false);

		myAssert.assertAll();

	}
@Test(invocationCount=3)
public void SearchRandomly() throws InterruptedException {
 driver.get("https://magento.softwaretestingboard.com/");
 Random rand= new Random();
 String[]clothes= {"Jacket", "t-shirt", "jeans for men","jeans for women","pants"};
int ManRandom= rand.nextInt(0,5);
driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(clothes[ManRandom]);
Thread.sleep(1000);
}
@Test()
public void randomlyAdd() throws InterruptedException {
	 
		Random rand = new Random();
		// Radianttee 
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(

		By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img"))
			.click();
		driver.manage().window().fullscreen();
		
		
		String[] size = { "//[@id=\"option-label-size-143-item-166\"]", "//[@id=\"option-label-size-143-item-167\"]",
				"//[@id=\"option-label-size-143-item-168\"]", "//[@id=\"option-label-size-143-item-169\"]",
				"//*[@id=\"option-label-size-143-item-170\"]" };

		String[] color = { "//[@id=\"option-label-color-93-item-50\"]", "//[@id=\"option-label-color-93-item-56\"]",
				"//*[@id=\"option-label-color-93-item-57\"]" };
	int  Radianttee=3;
for (int i=0;i<Radianttee;i++) {
			int sizeNumRan = rand.nextInt(5);
			int colorNumRan = rand.nextInt(3);
			Thread.sleep(5000);
			driver.findElement(By.xpath(size[sizeNumRan])).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(color[colorNumRan])).click();
			Thread.sleep(4000);
			//driver.findElement(By.name("qty")).clear();
		//	driver.findElement(By.name("qty")).sendKeys("3");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			
			Thread.sleep(4000);
		
	}
		 //breathe- easy tank
driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div/a/span/span/img"))
				.click();
		Thread.sleep(4000);
		String[] color2 = { "//[@id=\"option-label-color-93-item-57\"]","//[@id=\"option-label-color-93-item-59\"]",
				"//*[@id=\"option-label-color-93-item-60\"]" };
		Thread.sleep(4000);
		for (int i=0;i<2;i++) {
			int sizeNumRan = rand.nextInt(5);
			int colorNumRan = rand.nextInt(3);
			Thread.sleep(5000);
			driver.findElement(By.xpath(size[sizeNumRan])).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(color2[colorNumRan])).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			
			Thread.sleep(4000);
		}
		
		// argus all weather tank
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.manage().window().fullscreen();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div/a/span/span/img"))
				.click();
		Thread.sleep(5000);
		for (int i=0;i<7;i++) {
			int sizeNumRan = rand.nextInt(5);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath(size[sizeNumRan])).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-52\"]")).click();
			Thread.sleep(000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			Thread.sleep(5000);
		}

		// hero hoodie
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/a/img")).click();
		driver.findElement(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/a/span/span/img"))
				.click();
		int size_num = rand.nextInt(4);
		int colorNumRan = rand.nextInt(3);
		driver.findElement(By.xpath(size[size_num])).click();
		String[] color4 = { "//[@id=\"option-label-color-93-item-49\"]","//[@id=\"option-label-color-93-item-52\"]",
				"//*[@id=\"option-label-color-93-item-53\"]" };
		driver.findElement(By.xpath(color4[colorNumRan])).click();

		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

}}
