package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

    public static void CheckBlanksHoten(WebDriver driver){

        driver.findElement(By.xpath("//*[@id='main-layout']/section/div[2]/div/div/div/form/div/div[1]/input")).sendKeys("aaaa");
        driver.findElement(By.className("checkmark")).click();
        driver.findElement(By.xpath("//*[@id='main-layout']/section/div[2]/div/div/div/form/div/div[8]/div[1]/button")).click();

    }
}
