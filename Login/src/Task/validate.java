package Task;


import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;









public class validate {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
				
		driver.manage().window().maximize();
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-sukebr']//span[text()='Order']")));
		driver.findElement(By.xpath("//div[@class='css-sukebr']//span[text()='Order']")).click();
		driver.findElement(By.xpath("//a[@href='/mis/orders']//span[text()='Orders']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add Bulk Orders']")));
		driver.findElement(By.xpath("//button[normalize-space()='Add Bulk Orders']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement uploadfile = driver.findElement(By.xpath("//input[@type='file']"));
		uploadfile.sendKeys("C:\\Users\\user\\Downloads\\demodata.xlsx");
        driver.findElement(By.xpath("//button[normalize-space()='Import']")).click();
        driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
       
        }
}   
    
		
		
		
        
        
        