

//import org.testing.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {

        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NVVinh\\Desktop\\Setup IDEA\\chromedriver_win32\\chromedriver.exe");

        //Initiating your chromedriver
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        //driver.get("https://www.google.com");
        
        driver.navigate().to("https://www.google.com");

        //WebElement Control = driver.findElement(By.className("gLFyf"));
        //WebElement Control = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        
        WebElement Control = driver.findElement(By.xpath("//body[contains(string(),'google')]"));
        

        Control.sendKeys("W3School"); 
        Control.submit();

    }
}