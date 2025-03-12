import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;



public class Clinique {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		

        driver.get("https://www.clinique.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement skinCareMenu = driver.findElement(By.xpath("//span[(text()='Skincare')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(skinCareMenu).perform();
       
        List<WebElement> menuItems = driver.findElements(By.xpath("//a[contains(@aria-label,'Shop All Skincare')]/../../../../../../../../../div"));

        System.out.println("Skin Care Menu Items:");
        for (WebElement item : menuItems) {
      	  System.out.println("I created all these");

      	  System.out.println("tl buy all these products for the team");

      	  System.out.println("Teju did some changes");

      	  System.out.println("Amru shashanka teju srav and me");



            System.out.println(item.getText());

	}

}
}
