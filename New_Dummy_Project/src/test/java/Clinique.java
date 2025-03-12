import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



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

      	  System.out.println(" modified");
           System.out.println(item.getText());

           System.out.println("hai hello");
         
         
      	  System.out.println("Amrutha shashanka tejuashwini sravani and meeeeeee");



      	  System.out.println("Amrutha shashanka tejashwini sravani and meeeeeee");

      	  System.out.println("TL not responding");
      	  
      	  System.out.println("no need to modify now");


            System.out.println(item.getText());
            
            System.out.println("good evening");
            System.out.println("a new person added i.e, sam");
            


	}

}
}
