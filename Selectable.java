package week4.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement itm1=driver.findElementByXPath("//ol[@id='selectable']/li");
		WebElement itm5=driver.findElementByXPath("//ol[@id='selectable']/li[5]");

		Actions builder= new Actions(driver);
		builder.clickAndHold(itm1).moveToElement(itm5).release().perform();

	}

}
