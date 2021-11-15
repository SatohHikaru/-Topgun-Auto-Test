package TestCase;

import Model.importDriver;
import Page.Homepage;
import Page.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends Homepage{
   
    public static void main(String[] args) {

        Testcase_BlanksHoten();
        
    }

    public static void Testcase_BlanksHoten(){
        importDriver.ImportURLDriverChrom();
        WebDriver driver = new ChromeDriver();
        Homepage.ClickToRegister(driver);    
        Register.CheckBlanksHoten(driver);
    }
}
