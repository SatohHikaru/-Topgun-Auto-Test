package Page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    public static void ClickToRegister(WebDriver driver){
       
        driver.navigate().to("https://fumart.vn");
    
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='select-store-modal___BV_modal_body_']/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id='app-wrapper']/header/div[1]/div/div/div/div[1]/a")).click();
        
    }
}
