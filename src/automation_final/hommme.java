package automation_final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class hommme {
	WebDriver driver;
	SoftAssert myassert = new SoftAssert(); 


	@BeforeTest
	public void mySetup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://magento.softwaretestingboard.com/");

		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ayaodat821@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ayooshodatsaleem12@");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
}}
