package week4.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Sorttable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement itm1=driver.findElementByXPath("//li[@class='ui-state-default ui-sortable-handle']");
		WebElement itm5=driver.findElementByXPath("(//span[@class='ui-icon ui-icon-arrowthick-2-n-s'])[5]");
		Point p=itm5.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(p);
		Actions builder= new Actions(driver);
builder.dragAndDropBy(itm1, x, y).perform();
}

}
