package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class saucedeno {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options =new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver =new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	WebElement element = driver.findElement(By.className("Sauce Labs Backpack"));
	System.out.println(element.getText());
	WebElement element2 = driver.findElement(By.className("inventory_item_price"));
	System.out.println(element2.getText());
	
	driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("fa-layers-counter shopping_cart_badge")).click();
	
	
	
}
}
