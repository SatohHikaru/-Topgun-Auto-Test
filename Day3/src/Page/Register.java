package Page;

import Model.User;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends User{

    public static void CheckBlanksHoten(WebDriver driver){
        
        User user = new User();
        driver.findElement(By.xpath("//*[@id='main-layout']/section/div[2]/div/div/div/form/div/div[1]/input")).sendKeys(user.getUserName());
        driver.findElement(By.className("checkmark")).click();
        driver.findElement(By.xpath("//*[@id='main-layout']/section/div[2]/div/div/div/form/div/div[8]/div[1]/button")).click();

    }
}
